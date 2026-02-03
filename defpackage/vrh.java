package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vrh extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;

    public vrh(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        vrh vrhVar = new vrh((fcxy) obj3);
        vrhVar.a = (ekgb) obj;
        vrhVar.b = (ajlk) obj2;
        return vrhVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ajlk, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        boolean z = false;
        if (this.b.c() == ajlj.ONE_ON_ONE) {
            ekgb ekgbVar = (ekgb) obj2;
            if (ekgbVar.size() == 1 && ((ResolvedRecipient) ekgbVar.get(0)).g().z()) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
