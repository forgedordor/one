package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzdh extends cpyr {
    public bzdh(String str, String str2) {
        super(26, cpyz.NO_RETRY, str + " row " + str2 + " already exists in CMS, but its CMS ID could not be found");
    }

    public final boolean equals(Object obj) {
        bzdh bzdhVar = obj instanceof bzdh ? (bzdh) obj : null;
        return bzdhVar != null && fdbq.f(getMessage(), bzdhVar.getMessage()) && fdbq.f(getCause(), bzdhVar.getCause());
    }
}
