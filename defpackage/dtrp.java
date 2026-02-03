package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtrp extends evsf implements evui {
    public dtrp() {
        super(dtrs.a);
    }

    public final void a(String str, dtqy dtqyVar) {
        str.getClass();
        dtqyVar.getClass();
        copyOnWrite();
        dtrs dtrsVar = (dtrs) this.instance;
        dtrs dtrsVar2 = dtrs.a;
        dtrsVar.a().put(str, dtqyVar);
    }

    public final void b(String str) {
        str.getClass();
        copyOnWrite();
        dtrs dtrsVar = (dtrs) this.instance;
        dtrs dtrsVar2 = dtrs.a;
        dtrsVar.a().remove(str);
    }
}
