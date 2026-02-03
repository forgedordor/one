package defpackage;

import android.net.Uri;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vtf implements vsz {
    public final Uri a;
    public final ejxm b;
    private final dltd c;
    private final vup d;

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Iterable, java.util.Collection] */
    public vtf(vvr vvrVar, Uri uri, vup vupVar) {
        vvrVar.getClass();
        dltd dltdVar = vvrVar.a;
        ejxm ejxmVar = vvrVar.b.d;
        this.c = dltdVar;
        this.a = uri;
        this.d = vupVar;
        this.b = ejxmVar;
        if (!(dltdVar instanceof dohr)) {
            if (uri != null) {
                throw new IllegalArgumentException("Provided selected URI for attachment without variations");
            }
        } else {
            if (uri == null) {
                throw new IllegalArgumentException("No selected URI provided for attachment with variations");
            }
            ?? C = ((dohr) dltdVar).c();
            if (!C.isEmpty()) {
                Iterator it = C.iterator();
                while (it.hasNext()) {
                    if (fdbq.f(((dohq) it.next()).f(), this.a.toString())) {
                        return;
                    }
                }
            }
            throw new IllegalArgumentException("Selected URI for attachment with variations does not appear");
        }
    }

    @Override // defpackage.vsz
    public final dltd a() {
        return this.c;
    }

    @Override // defpackage.vta
    public final vup b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vtf)) {
            return false;
        }
        vtf vtfVar = (vtf) obj;
        return fdbq.f(this.c, vtfVar.c) && fdbq.f(this.a, vtfVar.a) && fdbq.f(this.d, vtfVar.d) && fdbq.f(this.b, vtfVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        Uri uri = this.a;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        vup vupVar = this.d;
        int iHashCode3 = (iHashCode2 + (vupVar == null ? 0 : vupVar.hashCode())) * 31;
        ejxm ejxmVar = this.b;
        return iHashCode3 + (ejxmVar != null ? ejxmVar.hashCode() : 0);
    }

    public final String toString() {
        Uri uri = this.a;
        String strD = uri != null ? cqcy.d(uri) : null;
        return "QueuedAttachment(hugoAttachment=" + this.c + ", selectedUri=" + strD + ", compressionInfo=" + this.d + ", draftLatencyStopwatch=" + this.b + ")";
    }
}
