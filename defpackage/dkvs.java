package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkvs {
    public static final dkvs a;
    public static final dkvs b;
    public static final dkvs c;
    public static final dkvs d;
    private static final /* synthetic */ dkvs[] f;
    public final djrr e;

    static {
        dkvs dkvsVar = new dkvs("Image", 0, djrr.bR);
        a = dkvsVar;
        dkvs dkvsVar2 = new dkvs("Video", 1, djrr.di);
        b = dkvsVar2;
        dkvs dkvsVar3 = new dkvs("PDF", 2, djrr.aR);
        c = dkvsVar3;
        dkvs dkvsVar4 = new dkvs("GenericFile", 3, djrr.aQ);
        d = dkvsVar4;
        dkvs[] dkvsVarArr = {dkvsVar, dkvsVar2, dkvsVar3, dkvsVar4};
        f = dkvsVarArr;
        fczb.a(dkvsVarArr);
    }

    private dkvs(String str, int i, djrr djrrVar) {
        this.e = djrrVar;
    }

    public static dkvs[] values() {
        return (dkvs[]) f.clone();
    }
}
