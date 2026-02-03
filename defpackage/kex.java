package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kex {
    public static final juo a(kew kewVar) {
        long j = kewVar.c;
        return kewVar.b.subSequence(jyo.d(j), jyo.c(j));
    }

    public static final juo b(kew kewVar, int i) {
        long j = kewVar.c;
        return kewVar.b.subSequence(jyo.c(j), Math.min(jyo.c(j) + i, kewVar.a().length()));
    }

    public static final juo c(kew kewVar, int i) {
        long j = kewVar.c;
        return kewVar.b.subSequence(Math.max(0, jyo.d(j) - i), jyo.d(j));
    }
}
