package defpackage;

import com.google.android.apps.messaging.multishare.chip.ChipData;
import com.google.android.apps.messaging.multishare.chip.ChipId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afqh extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ afqm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afqh(afqm afqmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = afqmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afqh) c((ChipData) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ChipData chipData = (ChipData) this.b;
        afqm afqmVar = this.c;
        this.a = 1;
        ChipId chipId = chipData.a;
        Object objB = chipId instanceof ChipId.Identity ? afqmVar.b(afqmVar.k.h(((ChipId.Identity) chipId).a), this) : afqmVar.j.a(((ChipId.Conversation) chipId).a, ajlm.MINIMAL);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        afqh afqhVar = new afqh(this.c, fcxyVar);
        afqhVar.b = obj;
        return afqhVar;
    }
}
