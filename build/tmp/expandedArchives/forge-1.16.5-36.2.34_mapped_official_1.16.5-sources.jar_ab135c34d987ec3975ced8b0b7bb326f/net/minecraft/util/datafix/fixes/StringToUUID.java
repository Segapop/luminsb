package net.minecraft.util.datafix.fixes;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import java.util.Optional;
import java.util.UUID;
import net.minecraft.util.datafix.TypeReferences;

public class StringToUUID extends DataFix {
   public StringToUUID(Schema p_i49652_1_, boolean p_i49652_2_) {
      super(p_i49652_1_, p_i49652_2_);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped("EntityStringUuidFix", this.getInputSchema().getType(TypeReferences.ENTITY), (p_206344_0_) -> {
         return p_206344_0_.update(DSL.remainderFinder(), (p_206345_0_) -> {
            Optional<String> optional = p_206345_0_.get("UUID").asString().result();
            if (optional.isPresent()) {
               UUID uuid = UUID.fromString(optional.get());
               return p_206345_0_.remove("UUID").set("UUIDMost", p_206345_0_.createLong(uuid.getMostSignificantBits())).set("UUIDLeast", p_206345_0_.createLong(uuid.getLeastSignificantBits()));
            } else {
               return p_206345_0_;
            }
         });
      });
   }
}