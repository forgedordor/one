package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxrd {
    public static volatile fbsy a;
    private static volatile fbrk b;

    private bxrd() {
    }

    public static fbrk a() {
        fbrk fbrkVarA;
        fbrk fbrkVar = b;
        if (fbrkVar != null) {
            return fbrkVar;
        }
        synchronized (bxrd.class) {
            fbrkVarA = b;
            if (fbrkVarA == null) {
                fbrh fbrhVarA = fbrk.a();
                fbrhVarA.c = fbrj.UNARY;
                fbrhVarA.d = fbrk.c("bugle.smapi.rcs.PdfFilePreviewGeneratorService", "GeneratePdfPreview");
                fbrhVarA.b();
                bxra bxraVar = bxra.a;
                evrr evrrVar = fcrj.a;
                fbrhVarA.a = new fcrh(bxraVar);
                fbrhVarA.b = new fcrh(bxrc.a);
                fbrkVarA = fbrhVarA.a();
                b = fbrkVarA;
            }
        }
        return fbrkVarA;
    }
}
