package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vht extends fcyz implements fdaw {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ vie d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vht(vie vieVar, fcxy fcxyVar) {
        super(5, fcxyVar);
        this.d = vieVar;
    }

    @Override // defpackage.fdaw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        vht vhtVar = new vht(this.d, (fcxy) obj5);
        vhtVar.a = (ajlk) obj;
        vhtVar.b = (Recipient) obj3;
        vhtVar.c = (ajlk) obj4;
        return vhtVar.b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [ajlk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [ajlk, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ?? r3 = this.a;
        Object obj2 = this.b;
        ?? r1 = this.c;
        if (obj2 == null) {
            return this.d.c(r3);
        }
        if (r1 == 0) {
            return null;
        }
        return this.d.c(r1);
    }
}
