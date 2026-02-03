package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzdf extends cpyr {
    public bzdf(String str) {
        super(27, cpyz.NO_RETRY, a.a(str, "Conversation row ", " already exists in CMS, but its CMS ID could not be found"));
    }

    public final boolean equals(Object obj) {
        bzdf bzdfVar = obj instanceof bzdf ? (bzdf) obj : null;
        return bzdfVar != null && fdbq.f(getMessage(), bzdfVar.getMessage()) && fdbq.f(getCause(), bzdfVar.getCause());
    }
}
