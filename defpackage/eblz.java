package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eblz extends ebmd implements Cloneable {
    public boolean a;
    public String b;
    public ebmk c = new ebmk(null);

    @Override // defpackage.ebmd
    public final String c() {
        String str = true != this.a ? "" : "+";
        String strValueOf = String.valueOf(this.b);
        boolean zH = this.c.h();
        String strConcat = str.concat(strValueOf);
        return !zH ? strConcat.concat(";").concat(this.c.c()) : strConcat;
    }

    @Override // defpackage.ebmd
    public final Object clone() {
        eblz eblzVar = new eblz();
        eblzVar.a = this.a;
        eblzVar.b = this.b;
        eblzVar.c = (ebmk) this.c.clone();
        return eblzVar;
    }
}
