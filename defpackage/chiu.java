package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chiu implements cgzu {
    @Override // defpackage.cgzu
    public final /* bridge */ /* synthetic */ cgyg a(Object obj) {
        chil chilVar = (chil) obj;
        chilVar.getClass();
        if (chilVar instanceof chij) {
            return new cgyg(3, null, 6);
        }
        if (chilVar instanceof chik) {
            return new cgyg(3, null, 6);
        }
        if (chilVar instanceof chif) {
            return new cgyg(1, null, 6);
        }
        if (chilVar instanceof chig) {
            return new cgyg(1, null, 6);
        }
        if (!(chilVar instanceof chii)) {
            throw new fctg();
        }
        if (((chii) chilVar) instanceof chih) {
            return new cgyg(2, null, 6);
        }
        throw new fctg();
    }
}
