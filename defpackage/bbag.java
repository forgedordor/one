package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbag {
    public static final bbag a;
    public static final bbag b;
    public static final bbag c;
    private static final /* synthetic */ bbag[] e;
    public final long d;

    static {
        bbag bbagVar = new bbag("NO_TRACE_STORAGE", 0, 0L);
        a = bbagVar;
        bbag bbagVar2 = new bbag("LOCAL_TRACE_STORAGE", 1, 1L);
        b = bbagVar2;
        bbag bbagVar3 = new bbag("UPLOAD_TRACE_DATA", 2, 2L);
        c = bbagVar3;
        bbag[] bbagVarArr = {bbagVar, bbagVar2, bbagVar3};
        e = bbagVarArr;
        fczb.a(bbagVarArr);
    }

    private bbag(String str, int i, long j) {
        this.d = j;
    }

    public static bbag[] values() {
        return (bbag[]) e.clone();
    }
}
