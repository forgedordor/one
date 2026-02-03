package defpackage;

import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fesp extends fero {
    private static final long serialVersionUID = 5629679741050917815L;
    public final fenb c;

    public fesp() {
        super("VTIMEZONE");
        this.c = new fenb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ferq c(fend fendVar) {
        fenb fenbVar = this.c;
        int size = fenbVar.size();
        ferq ferqVar = null;
        fend fendVar2 = null;
        for (int i = 0; i < size; i++) {
            ferq ferqVar2 = (ferq) fenbVar.get(i);
            fend fendVarC = ferqVar2.c(fendVar);
            if (fendVar2 == null || (fendVarC != null && fendVarC.after(fendVar2))) {
                ferqVar = ferqVar2;
                fendVar2 = fendVarC;
            }
        }
        return ferqVar;
    }

    @Override // defpackage.femz
    public final boolean equals(Object obj) {
        return obj instanceof fesp ? super.equals(obj) && ffhd.a(this.c, ((fesp) obj).c) : super.equals(obj);
    }

    @Override // defpackage.femz
    public final int hashCode() {
        ffhg ffhgVar = new ffhg();
        ffhgVar.c(this.a);
        ffhgVar.c(this.b);
        ffhgVar.c(this.c);
        return ffhgVar.a;
    }

    @Override // defpackage.femz
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("BEGIN:");
        stringBuffer.append(this.a);
        stringBuffer.append(VCardBuilder.VCARD_END_OF_LINE);
        stringBuffer.append(this.b);
        stringBuffer.append(this.c);
        stringBuffer.append("END:");
        stringBuffer.append(this.a);
        stringBuffer.append(VCardBuilder.VCARD_END_OF_LINE);
        return stringBuffer.toString();
    }

    public fesp(ferc fercVar) {
        super("VTIMEZONE", fercVar);
        this.c = new fenb();
    }
}
