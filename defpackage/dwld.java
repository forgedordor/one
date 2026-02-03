package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwld extends dwlh {
    public static final dwld a = new dwld();

    private dwld() {
    }

    @Override // defpackage.dwqt
    public final dwqv a() {
        return dwqv.DEFAULT_RENDERING_TYPE;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "RenderingDetails{defaultRenderingType}";
    }
}
