package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzdc extends cpyr {
    public bzdc() {
        super(9, cpyz.NO_RETRY, "Row intentionally skipped during CMS backup due to CmsLifeCycle.EXCLUDED");
    }

    public final boolean equals(Object obj) {
        bzdc bzdcVar = obj instanceof bzdc ? (bzdc) obj : null;
        if (bzdcVar == null) {
            return false;
        }
        return fdbq.f(getMessage(), bzdcVar.getMessage());
    }
}
