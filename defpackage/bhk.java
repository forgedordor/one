package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bhk extends bmh {
    public bjz a;
    public List b;
    public Integer c;
    private Integer d;
    private azv e;

    @Override // defpackage.bmh
    public final bmi a() {
        bjz bjzVar = this.a;
        List list = this.b;
        String strConcat = bjzVar == null ? " surface" : "";
        if (list == null) {
            strConcat = strConcat.concat(" sharedSurfaces");
        }
        if (this.d == null) {
            strConcat = strConcat.concat(" mirrorMode");
        }
        if (this.c == null) {
            strConcat = strConcat.concat(" surfaceGroupId");
        }
        if (this.e == null) {
            strConcat = strConcat.concat(" dynamicRange");
        }
        if (!strConcat.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }
        bjz bjzVar2 = this.a;
        List list2 = this.b;
        int iIntValue = this.d.intValue();
        this.c.intValue();
        return new bhl(bjzVar2, list2, iIntValue, this.e);
    }

    @Override // defpackage.bmh
    public final void b(azv azvVar) {
        if (azvVar == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.e = azvVar;
    }

    @Override // defpackage.bmh
    public final void c(int i) {
        this.d = Integer.valueOf(i);
    }
}
