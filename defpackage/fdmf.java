package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdmf {
    public static final fdzi a = new fdzi("COMPLETING_ALREADY");
    public static final fdzi b = new fdzi("COMPLETING_WAITING_CHILDREN");
    public static final fdzi c = new fdzi("COMPLETING_RETRY");
    public static final fdzi d = new fdzi("TOO_LATE_TO_CANCEL");
    public static final fdzi e = new fdzi("SEALED");
    public static final fdkv f = new fdkv(false);
    public static final fdkv g = new fdkv(true);

    public static final Object a(Object obj) {
        return obj instanceof fdll ? new fdlm((fdll) obj) : obj;
    }

    public static final Object b(Object obj) {
        fdll fdllVar;
        fdlm fdlmVar = obj instanceof fdlm ? (fdlm) obj : null;
        return (fdlmVar == null || (fdllVar = fdlmVar.a) == null) ? obj : fdllVar;
    }
}
