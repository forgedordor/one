package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcps extends dcpq {
    final /* synthetic */ dcpy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcps(dcpy dcpyVar, String str) {
        super(str, null);
        this.a = dcpyVar;
    }

    @Override // defpackage.dcpq
    public final /* bridge */ /* synthetic */ Object a(String str, Throwable th) {
        dcpy dcpyVar = this.a;
        dcqg dcqgVar = dcpyVar.b;
        return new dcqd(dcpyVar.a, dcqgVar, "init " + (true != dcqgVar.e() ? "(service thread not alive) " : "") + str, this.g, th);
    }

    @Override // defpackage.dcpq
    public final /* bridge */ /* synthetic */ Object c(dcpo dcpoVar) {
        return dcpoVar;
    }
}
