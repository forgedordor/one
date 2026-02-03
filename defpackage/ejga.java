package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejga {
    public static final ejga a;
    public static final ejga b;
    public static final ejga c;
    public static final ejga d;
    public static final ejga e;
    public static final ejga f;
    private static final /* synthetic */ ejga[] g;

    static {
        ejga ejgaVar = new ejga("SEGMENTATION_EMPTY", 0);
        a = ejgaVar;
        ejga ejgaVar2 = new ejga("SEGMENTATION_TIMEOUT", 1);
        b = ejgaVar2;
        ejga ejgaVar3 = new ejga("SEGMENTATION_OOM", 2);
        c = ejgaVar3;
        ejga ejgaVar4 = new ejga("SEGMENTATION_ERROR", 3);
        d = ejgaVar4;
        ejga ejgaVar5 = new ejga("SEGMENTER_SETUP_ERROR", 4);
        e = ejgaVar5;
        ejga ejgaVar6 = new ejga("UNSATISFIED_LINK_ERROR", 5);
        f = ejgaVar6;
        ejga[] ejgaVarArr = {ejgaVar, ejgaVar2, ejgaVar3, ejgaVar4, ejgaVar5, ejgaVar6};
        g = ejgaVarArr;
        fczb.a(ejgaVarArr);
    }

    private ejga(String str, int i) {
    }

    public static ejga[] values() {
        return (ejga[]) g.clone();
    }
}
