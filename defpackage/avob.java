package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avob {
    public static final avob a;
    public static final avob b;
    private static final /* synthetic */ avob[] c;

    static {
        avob avobVar = new avob("AUDIO", 0);
        a = avobVar;
        avob avobVar2 = new avob("CAMERA_GALLERY", 1);
        b = avobVar2;
        avob[] avobVarArr = {avobVar, avobVar2};
        c = avobVarArr;
        fczb.a(avobVarArr);
    }

    private avob(String str, int i) {
    }

    public static avob[] values() {
        return (avob[]) c.clone();
    }
}
