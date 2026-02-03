package defpackage;

import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agdn implements afzx {
    public final Uri a;
    public final String b;
    public final Uri c;
    public final List d;
    public final Integer e;
    public final long f;
    public final boolean g;
    public final List h;
    public final int i;
    private final boolean j;
    private final int k;

    public agdn(Uri uri, String str, long j, boolean z) {
        this(2, uri, str, null, null, null, j, z, 1816);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agdn)) {
            return false;
        }
        agdn agdnVar = (agdn) obj;
        if (this.i != agdnVar.i || !fdbq.f(this.a, agdnVar.a) || !fdbq.f(this.b, agdnVar.b) || !fdbq.f(this.c, agdnVar.c) || !fdbq.f(this.d, agdnVar.d) || !fdbq.f(this.e, agdnVar.e) || !fdhi.p(this.f, agdnVar.f) || this.g != agdnVar.g || !fdbq.f(this.h, agdnVar.h)) {
            return false;
        }
        boolean z = agdnVar.j;
        int i = agdnVar.k;
        return true;
    }

    public final int hashCode() {
        Uri uri = this.a;
        int iHashCode = uri == null ? 0 : uri.hashCode();
        int i = this.i;
        String str = this.b;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int i2 = (i * 31) + iHashCode;
        Uri uri2 = this.c;
        int iHashCode3 = ((((((i2 * 31) + iHashCode2) * 31) + (uri2 == null ? 0 : uri2.hashCode())) * 31) + this.d.hashCode()) * 31;
        Integer num = this.e;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        long j = this.f;
        long j2 = fdhi.a;
        return ((((((((((iHashCode3 + iHashCode4) * 31) + fdhh.a(j)) * 31) + agdm.a(this.g)) * 31) + 1) * 31) + agdm.a(false)) * 31) + 1;
    }

    public final String toString() {
        return "MediaViewer(openingSource=" + ((Object) emyz.b(this.i)) + ", uri=" + this.a + ", contentType=" + this.b + ", photos=" + this.c + ", items=" + this.d + ", position=" + this.e + ", videoStartPosition=" + fdhi.n(this.f) + ", startPlayingVideo=" + this.g + ", secondaryButtons=" + this.h + ", openInEditor=false, mediaEditorType=1)";
    }

    public /* synthetic */ agdn(int i, Uri uri, String str, Uri uri2, int i2) {
        this(i, uri, str, (i2 & 8) != 0 ? null : uri2, fcvo.a, null, 0L, false, 1984);
    }

    public /* synthetic */ agdn(int i, Uri uri, String str, Uri uri2, List list, Integer num, long j, boolean z, int i2) {
        list = (i2 & 16) != 0 ? fcvo.a : list;
        num = (i2 & 32) != 0 ? null : num;
        if ((i2 & 64) != 0) {
            long j2 = fdhi.a;
            j = 0;
        }
        int i3 = i2 & 4;
        int i4 = i2 & 2;
        uri2 = (i2 & 8) != 0 ? null : uri2;
        str = i3 != 0 ? null : str;
        uri = i4 != 0 ? null : uri;
        boolean z2 = z & ((i2 & 128) == 0);
        fcvo fcvoVar = fcvo.a;
        list.getClass();
        this.i = i;
        this.a = uri;
        this.b = str;
        this.c = uri2;
        this.d = list;
        this.e = num;
        this.f = j;
        this.g = z2;
        this.h = fcvoVar;
        this.j = false;
        this.k = 1;
    }
}
