package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahqj {
    public final String a;
    public final Uri b;
    public final String c;
    public final String d;
    public final long e;

    public ahqj(PartsTable.BindData bindData) {
        bindData.getClass();
        String strL = bindData.L();
        Uri uriT = bindData.t();
        String strI = bindData.I();
        String strJ = bindData.J();
        long jR = bindData.r();
        this.a = strL;
        this.b = uriT;
        this.c = strI;
        this.d = strJ;
        this.e = jR;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahqj)) {
            return false;
        }
        ahqj ahqjVar = (ahqj) obj;
        return fdbq.f(this.a, ahqjVar.a) && fdbq.f(this.b, ahqjVar.b) && fdbq.f(this.c, ahqjVar.c) && fdbq.f(this.d, ahqjVar.d) && this.e == ahqjVar.e;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        Uri uri = this.b;
        int iHashCode2 = uri == null ? 0 : uri.hashCode();
        int i = iHashCode * 31;
        String str2 = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        long j = this.e;
        return iHashCode4 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "Part(text=" + this.a + ", contentUri=" + this.b + ", contentType=" + this.c + ", fileName=" + this.d + ", durationMs=" + this.e + ")";
    }
}
