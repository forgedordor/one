package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bacn extends bahy {
    public final MessageIdType a;
    public final String b;
    public final String c;
    public final Uri d;
    public final Uri e;
    public final int f;
    public final int g;
    public final long h;
    public final long i;
    public final elha j;
    public final String k;
    public final String l;
    public final long m;
    public final LocationInformation n;
    public final String o;
    public final String p;
    public final String q;
    public final dqbw r;
    public final long s;
    public final bvdr t;
    public final int u;
    public final boolean v;
    public final boolean w;
    public final athh x;
    public final bvdq y;
    public final bvdy z;

    public bacn(MessageIdType messageIdType, String str, String str2, Uri uri, Uri uri2, int i, int i2, long j, long j2, elha elhaVar, String str3, String str4, long j3, LocationInformation locationInformation, String str5, String str6, String str7, dqbw dqbwVar, long j4, bvdr bvdrVar, int i3, boolean z, boolean z2, athh athhVar, bvdq bvdqVar, bvdy bvdyVar) {
        this.a = messageIdType;
        this.b = str;
        this.c = str2;
        this.d = uri;
        this.e = uri2;
        this.f = i;
        this.g = i2;
        this.h = j;
        this.i = j2;
        this.j = elhaVar;
        this.k = str3;
        this.l = str4;
        this.m = j3;
        this.n = locationInformation;
        this.o = str5;
        this.p = str6;
        this.q = str7;
        this.r = dqbwVar;
        this.s = j4;
        this.t = bvdrVar;
        this.u = i3;
        this.v = z;
        this.w = z2;
        this.x = athhVar;
        this.y = bvdqVar;
        this.z = bvdyVar;
    }

    @Override // defpackage.bahy
    public final int a() {
        return this.u;
    }

    @Override // defpackage.bahy
    public final int b() {
        return this.g;
    }

    @Override // defpackage.bahy
    public final int c() {
        return this.f;
    }

    @Override // defpackage.bahy
    public final long d() {
        return this.h;
    }

    @Override // defpackage.bahy
    public final long e() {
        return this.s;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        LocationInformation locationInformation;
        String str4;
        String str5;
        String str6;
        dqbw dqbwVar;
        athh athhVar;
        bvdq bvdqVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bahy) {
            bahy bahyVar = (bahy) obj;
            if (this.a.equals(bahyVar.k()) && ((str = this.b) != null ? str.equals(bahyVar.u()) : bahyVar.u() == null)) {
                bahyVar.C();
                String str7 = this.c;
                if (str7 != null ? str7.equals(bahyVar.r()) : bahyVar.r() == null) {
                    Uri uri = this.d;
                    if (uri != null ? uri.equals(bahyVar.h()) : bahyVar.h() == null) {
                        Uri uri2 = this.e;
                        if (uri2 != null ? uri2.equals(bahyVar.i()) : bahyVar.i() == null) {
                            bahyVar.A();
                            if (this.f == bahyVar.c() && this.g == bahyVar.b() && this.h == bahyVar.d()) {
                                bahyVar.B();
                                if (this.i == bahyVar.g() && this.j.equals(bahyVar.q()) && ((str2 = this.k) != null ? str2.equals(bahyVar.x()) : bahyVar.x() == null) && ((str3 = this.l) != null ? str3.equals(bahyVar.w()) : bahyVar.w() == null) && this.m == bahyVar.f() && ((locationInformation = this.n) != null ? locationInformation.equals(bahyVar.o()) : bahyVar.o() == null) && ((str4 = this.o) != null ? str4.equals(bahyVar.s()) : bahyVar.s() == null) && ((str5 = this.p) != null ? str5.equals(bahyVar.t()) : bahyVar.t() == null) && ((str6 = this.q) != null ? str6.equals(bahyVar.v()) : bahyVar.v() == null) && ((dqbwVar = this.r) != null ? dqbwVar.equals(bahyVar.p()) : bahyVar.p() == null) && this.s == bahyVar.e() && this.t.equals(bahyVar.m()) && this.u == bahyVar.a() && this.v == bahyVar.y() && this.w == bahyVar.z() && ((athhVar = this.x) != null ? athhVar.equals(bahyVar.j()) : bahyVar.j() == null) && ((bvdqVar = this.y) != null ? bvdqVar.equals(bahyVar.l()) : bahyVar.l() == null) && this.z.equals(bahyVar.n())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.bahy
    public final long f() {
        return this.m;
    }

    @Override // defpackage.bahy
    public final long g() {
        return this.i;
    }

    @Override // defpackage.bahy
    public final Uri h() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int i = iHashCode * 1000003;
        String str2 = this.c;
        int iHashCode3 = (((i ^ iHashCode2) * (-721379959)) ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Uri uri = this.d;
        int iHashCode4 = (iHashCode3 ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        Uri uri2 = this.e;
        int iHashCode5 = (((((iHashCode4 ^ (uri2 == null ? 0 : uri2.hashCode())) * (-721379959)) ^ this.f) * 1000003) ^ this.g) * 1000003;
        long j = this.h;
        int i2 = (iHashCode5 ^ ((int) (j ^ (j >>> 32)))) * (-721379959);
        long j2 = this.i;
        int iHashCode6 = (((i2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.j.hashCode()) * 1000003;
        String str3 = this.k;
        int iHashCode7 = (iHashCode6 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.l;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        long j3 = this.m;
        int i3 = (((iHashCode7 ^ iHashCode8) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        LocationInformation locationInformation = this.n;
        int iHashCode9 = (i3 ^ (locationInformation == null ? 0 : locationInformation.hashCode())) * 1000003;
        String str5 = this.o;
        int iHashCode10 = (iHashCode9 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.p;
        int iHashCode11 = (iHashCode10 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.q;
        int iHashCode12 = (iHashCode11 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        dqbw dqbwVar = this.r;
        int iHashCode13 = dqbwVar == null ? 0 : dqbwVar.hashCode();
        long j4 = this.s;
        int iHashCode14 = (((((((((((iHashCode12 ^ iHashCode13) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ this.t.hashCode()) * 1000003) ^ this.u) * 1000003) ^ (true != this.v ? 1237 : 1231)) * 1000003) ^ (true == this.w ? 1231 : 1237)) * 1000003;
        athh athhVar = this.x;
        int iHashCode15 = (iHashCode14 ^ (athhVar == null ? 0 : athhVar.hashCode())) * 1000003;
        bvdq bvdqVar = this.y;
        return ((iHashCode15 ^ (bvdqVar != null ? bvdqVar.hashCode() : 0)) * 1000003) ^ this.z.hashCode();
    }

    @Override // defpackage.bahy
    public final Uri i() {
        return this.e;
    }

    @Override // defpackage.bahy
    public final athh j() {
        return this.x;
    }

    @Override // defpackage.bahy
    public final MessageIdType k() {
        return this.a;
    }

    @Override // defpackage.bahy
    public final bvdq l() {
        return this.y;
    }

    @Override // defpackage.bahy
    public final bvdr m() {
        return this.t;
    }

    @Override // defpackage.bahy
    public final bvdy n() {
        return this.z;
    }

    @Override // defpackage.bahy
    public final LocationInformation o() {
        return this.n;
    }

    @Override // defpackage.bahy
    public final dqbw p() {
        return this.r;
    }

    @Override // defpackage.bahy
    public final elha q() {
        return this.j;
    }

    @Override // defpackage.bahy
    public final String r() {
        return this.c;
    }

    @Override // defpackage.bahy
    public final String s() {
        return this.o;
    }

    @Override // defpackage.bahy
    public final String t() {
        return this.p;
    }

    public final String toString() {
        bvdy bvdyVar = this.z;
        bvdq bvdqVar = this.y;
        athh athhVar = this.x;
        bvdr bvdrVar = this.t;
        dqbw dqbwVar = this.r;
        LocationInformation locationInformation = this.n;
        elha elhaVar = this.j;
        Uri uri = this.e;
        Uri uri2 = this.d;
        String string = this.a.toString();
        String strValueOf = String.valueOf(uri2);
        String strValueOf2 = String.valueOf(uri);
        String string2 = elhaVar.toString();
        String strValueOf3 = String.valueOf(locationInformation);
        String strValueOf4 = String.valueOf(dqbwVar);
        String string3 = bvdrVar.toString();
        String strValueOf5 = String.valueOf(athhVar);
        String strValueOf6 = String.valueOf(bvdqVar);
        String string4 = bvdyVar.toString();
        StringBuilder sb = new StringBuilder("MessagePartDataValues{messageId=");
        sb.append(string);
        sb.append(", messageText=");
        sb.append(this.b);
        sb.append(", rawText=null, contentType=");
        sb.append(this.c);
        sb.append(", contentUri=");
        sb.append(strValueOf);
        sb.append(", originalUri=");
        sb.append(strValueOf2);
        sb.append(", fallbackUri=null, width=");
        sb.append(this.f);
        sb.append(", height=");
        sb.append(this.g);
        sb.append(", duration=");
        sb.append(this.h);
        sb.append(", outputUri=null, targetFileSize=");
        sb.append(this.i);
        sb.append(", source=");
        sb.append(string2);
        sb.append(", stickerSetId=");
        sb.append(this.k);
        sb.append(", stickerId=");
        sb.append(this.l);
        sb.append(", mediaModifiedTimestamp=");
        sb.append(this.m);
        sb.append(", locationInfo=");
        sb.append(strValueOf3);
        sb.append(", expressiveStickerName=");
        sb.append(this.o);
        sb.append(", fileName=");
        sb.append(this.p);
        sb.append(", previewContentType=");
        sb.append(this.q);
        sb.append(", voiceMetadata=");
        sb.append(strValueOf4);
        sb.append(", fileSizeBytes=");
        sb.append(this.s);
        sb.append(", mediaSendType=");
        sb.append(string3);
        sb.append(", bundleIndex=");
        sb.append(this.u);
        boolean z = this.w;
        boolean z2 = this.v;
        sb.append(", preserveSize=");
        sb.append(z2);
        sb.append(", saveToExternalStorage=");
        sb.append(z);
        sb.append(", processingId=");
        sb.append(strValueOf5);
        sb.append(", imageDisplayState=");
        sb.append(strValueOf6);
        sb.append(", richCardMediaDownloadFailureReason=");
        sb.append(string4);
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.bahy
    public final String u() {
        return this.b;
    }

    @Override // defpackage.bahy
    public final String v() {
        return this.q;
    }

    @Override // defpackage.bahy
    public final String w() {
        return this.l;
    }

    @Override // defpackage.bahy
    public final String x() {
        return this.k;
    }

    @Override // defpackage.bahy
    public final boolean y() {
        return this.v;
    }

    @Override // defpackage.bahy
    public final boolean z() {
        return this.w;
    }

    @Override // defpackage.bahy
    public final void A() {
    }

    @Override // defpackage.bahy
    public final void B() {
    }

    @Override // defpackage.bahy
    public final void C() {
    }
}
