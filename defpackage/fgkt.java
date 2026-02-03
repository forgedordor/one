package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgkt extends fgkk {
    public Integer a;
    public Integer b;
    public int c;
    public String d;

    public static void e(Integer num, Integer num2) {
        if (num != null && num2 != null && num2.intValue() < num.intValue()) {
            throw new IllegalArgumentException("fence lengths required to be: closingFenceLength >= openingFenceLength");
        }
    }

    @Override // defpackage.fgle
    public final void d(fglq fglqVar) {
        fglqVar.e(this);
    }
}
