package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dojp implements dojw, dohq {
    public static final Parcelable.Creator<dojp> CREATOR = new dojo();
    public final dogg a;
    public final String b;
    public final String c;
    public final dltc d;
    public final Duration e;
    public final dqbw f;
    private final Map g;
    private final long h;
    private final Instant i;

    public dojp(dogg doggVar, String str, Map map, String str2, long j, Instant instant, dltc dltcVar, Duration duration, dqbw dqbwVar) {
        doggVar.getClass();
        str.getClass();
        instant.getClass();
        dltcVar.getClass();
        duration.getClass();
        dqbwVar.getClass();
        this.a = doggVar;
        this.b = str;
        this.g = map;
        this.c = str2;
        this.h = j;
        this.i = instant;
        this.d = dltcVar;
        this.e = duration;
        this.f = dqbwVar;
    }

    public static /* synthetic */ dojp h(dojp dojpVar, dqbw dqbwVar) {
        return new dojp(dojpVar.a, dojpVar.b, dojpVar.g, dojpVar.c, dojpVar.h, dojpVar.i, dojpVar.d, dojpVar.e, dqbwVar);
    }

    @Override // defpackage.dohq, defpackage.dltn
    public final long a() {
        return this.h;
    }

    @Override // defpackage.dojw, defpackage.dohq, defpackage.dltn
    public final /* synthetic */ doig b() {
        return dojn.a(this);
    }

    @Override // defpackage.dltn
    public final Instant c() {
        return this.i;
    }

    @Override // defpackage.dltn
    public final String d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.dltn
    public final /* synthetic */ String e() {
        return dltj.b(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dojp)) {
            return false;
        }
        dojp dojpVar = (dojp) obj;
        return fdbq.f(this.a, dojpVar.a) && fdbq.f(this.b, dojpVar.b) && fdbq.f(this.g, dojpVar.g) && fdbq.f(this.c, dojpVar.c) && this.h == dojpVar.h && fdbq.f(this.i, dojpVar.i) && fdbq.f(this.d, dojpVar.d) && fdbq.f(this.e, dojpVar.e) && fdbq.f(this.f, dojpVar.f);
    }

    @Override // defpackage.dohq, defpackage.dltn
    public final String f() {
        return this.b;
    }

    @Override // defpackage.dltd
    public final dltc fo() {
        return this.d;
    }

    @Override // defpackage.dlti
    public final /* bridge */ /* synthetic */ Object fp() {
        return e();
    }

    @Override // defpackage.dltd
    public final /* synthetic */ String fq() {
        return toString();
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Map map = this.g;
        int iHashCode2 = ((iHashCode * 31) + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = str != null ? str.hashCode() : 0;
        long j = this.h;
        return ((((((((((iHashCode2 + iHashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.i.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    @Override // defpackage.dohq
    public final /* synthetic */ dogj l() {
        return this.a;
    }

    @Override // defpackage.dohq, defpackage.dohs
    public final /* synthetic */ doif m() {
        return dohn.a(this);
    }

    @Override // defpackage.dohq
    public final /* synthetic */ doin n() {
        return doin.d;
    }

    @Override // defpackage.dohq
    public final Map o() {
        return this.g;
    }

    public final String toString() {
        return "Audio(format=" + this.a + ", url=" + this.b + ", headers=" + this.g + ", displayName=" + this.c + ", sizeBytes=" + this.h + ", dateModified=" + this.i + ", source=" + this.d + ", duration=" + this.e + ", voiceMetadata=" + this.f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        Map map = this.g;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        parcel.writeString(this.c);
        parcel.writeLong(this.h);
        parcel.writeSerializable(this.i);
        parcel.writeParcelable(this.d, i);
        parcel.writeSerializable(this.e);
        ProtoParsers.h(parcel, this.f);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ dojp(defpackage.dogg r14, java.lang.String r15, java.util.Map r16, java.lang.String r17, long r18, j$.time.Instant r20, defpackage.dltc r21, j$.time.Duration r22, defpackage.dqbw r23, int r24) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto La
            dqbw r1 = defpackage.dqbw.a
            r12 = r1
            goto Lc
        La:
            r12 = r23
        Lc:
            r1 = r0 & 8
            r0 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L15
            r6 = r2
            goto L17
        L15:
            r6 = r17
        L17:
            if (r0 == 0) goto L26
            r5 = r2
            r3 = r14
            r4 = r15
            r7 = r18
            r9 = r20
            r10 = r21
            r11 = r22
            r2 = r13
            goto L33
        L26:
            r5 = r16
            r2 = r13
            r3 = r14
            r4 = r15
            r7 = r18
            r9 = r20
            r10 = r21
            r11 = r22
        L33:
            r2.<init>(r3, r4, r5, r6, r7, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dojp.<init>(dogg, java.lang.String, java.util.Map, java.lang.String, long, j$.time.Instant, dltc, j$.time.Duration, dqbw, int):void");
    }
}
