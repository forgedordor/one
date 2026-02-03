package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class udf extends fdbb implements fdat {
    public static final udf a = new udf();

    public udf() {
        super(2, ellg.class, "setBugleContact", "setBugleContact(Lcom/google/common/logging/BugleProtos$BugleContact$Builder;)Lcom/google/common/logging/BugleProtos$BugleEvent$Builder;", 8);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ellg ellgVar = (ellg) obj;
        eljo eljoVar = (eljo) obj2;
        ellgVar.getClass();
        eljoVar.getClass();
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        eljp eljpVar = (eljp) eljoVar.build();
        ellh ellhVar2 = ellh.a;
        eljpVar.getClass();
        ellhVar.C = eljpVar;
        ellhVar.b |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        return fctx.a;
    }
}
