package defpackage;

import android.os.health.HealthStats;
import com.android.vcard.VCardConfig;
import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzjz {
    static final dzks a(Long l, Long l2, HealthStats healthStats, fecr fecrVar, feeg feegVar, dzka dzkaVar) {
        dzkj dzkjVar;
        fedj fedjVar = (fedj) fedk.a.createBuilder();
        long jA = dzkq.a(healthStats, 10001);
        if (jA != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar = (fedk) fedjVar.instance;
            fedkVar.b |= 1;
            fedkVar.d = jA;
        }
        long jA2 = dzkq.a(healthStats, 10002);
        if (jA2 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar2 = (fedk) fedjVar.instance;
            fedkVar2.b |= 2;
            fedkVar2.e = jA2;
        }
        long jA3 = dzkq.a(healthStats, 10003);
        if (jA3 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar3 = (fedk) fedjVar.instance;
            fedkVar3.b |= 4;
            fedkVar3.f = jA3;
        }
        long jA4 = dzkq.a(healthStats, 10004);
        if (jA4 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar4 = (fedk) fedjVar.instance;
            fedkVar4.b |= 8;
            fedkVar4.g = jA4;
        }
        fedjVar.n(dzkq.b(healthStats, 10005));
        fedjVar.o(dzkq.b(healthStats, 10006));
        fedjVar.p(dzkq.b(healthStats, 10007));
        fedjVar.m(dzkq.b(healthStats, 10008));
        fedjVar.l(dzkq.b(healthStats, 10009));
        fedjVar.h(dzkq.b(healthStats, 10010));
        fedi fediVarE = dzkq.e(healthStats, 10011);
        if (fediVarE != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar5 = (fedk) fedjVar.instance;
            fedkVar5.n = fediVarE;
            fedkVar5.b |= 16;
        }
        fedjVar.i(dzkq.b(healthStats, 10012));
        fedjVar.k(dzkm.a.d(dzkq.c(healthStats, 10014)));
        fedjVar.j(dzkl.a.d(dzkq.c(healthStats, 10015)));
        long jA5 = dzkq.a(healthStats, 10016);
        if (jA5 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar6 = (fedk) fedjVar.instance;
            fedkVar6.b |= 32;
            fedkVar6.s = jA5;
        }
        long jA6 = dzkq.a(healthStats, 10017);
        if (jA6 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar7 = (fedk) fedjVar.instance;
            fedkVar7.b |= 64;
            fedkVar7.t = jA6;
        }
        long jA7 = dzkq.a(healthStats, 10018);
        if (jA7 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar8 = (fedk) fedjVar.instance;
            fedkVar8.b |= 128;
            fedkVar8.u = jA7;
        }
        long jA8 = dzkq.a(healthStats, 10019);
        if (jA8 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar9 = (fedk) fedjVar.instance;
            fedkVar9.b |= 256;
            fedkVar9.v = jA8;
        }
        long jA9 = dzkq.a(healthStats, 10020);
        if (jA9 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar10 = (fedk) fedjVar.instance;
            fedkVar10.b |= 512;
            fedkVar10.w = jA9;
        }
        long jA10 = dzkq.a(healthStats, 10021);
        if (jA10 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar11 = (fedk) fedjVar.instance;
            fedkVar11.b |= 1024;
            fedkVar11.x = jA10;
        }
        long jA11 = dzkq.a(healthStats, 10022);
        if (jA11 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar12 = (fedk) fedjVar.instance;
            fedkVar12.b |= 2048;
            fedkVar12.y = jA11;
        }
        long jA12 = dzkq.a(healthStats, 10023);
        if (jA12 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar13 = (fedk) fedjVar.instance;
            fedkVar13.b |= 4096;
            fedkVar13.z = jA12;
        }
        long jA13 = dzkq.a(healthStats, 10024);
        if (jA13 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar14 = (fedk) fedjVar.instance;
            fedkVar14.b |= 8192;
            fedkVar14.A = jA13;
        }
        long jA14 = dzkq.a(healthStats, 10025);
        if (jA14 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar15 = (fedk) fedjVar.instance;
            fedkVar15.b |= 16384;
            fedkVar15.B = jA14;
        }
        long jA15 = dzkq.a(healthStats, 10026);
        if (jA15 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar16 = (fedk) fedjVar.instance;
            fedkVar16.b |= 32768;
            fedkVar16.C = jA15;
        }
        long jA16 = dzkq.a(healthStats, 10027);
        if (jA16 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar17 = (fedk) fedjVar.instance;
            fedkVar17.b |= 65536;
            fedkVar17.D = jA16;
        }
        long jA17 = dzkq.a(healthStats, 10028);
        if (jA17 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar18 = (fedk) fedjVar.instance;
            fedkVar18.b |= 131072;
            fedkVar18.E = jA17;
        }
        long jA18 = dzkq.a(healthStats, 10029);
        if (jA18 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar19 = (fedk) fedjVar.instance;
            fedkVar19.b |= 262144;
            fedkVar19.F = jA18;
        }
        fedi fediVarE2 = dzkq.e(healthStats, 10030);
        if (fediVarE2 != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar20 = (fedk) fedjVar.instance;
            fedkVar20.G = fediVarE2;
            fedkVar20.b |= 524288;
        }
        long jA19 = dzkq.a(healthStats, 10031);
        if (jA19 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar21 = (fedk) fedjVar.instance;
            fedkVar21.b |= 1048576;
            fedkVar21.H = jA19;
        }
        fedi fediVarE3 = dzkq.e(healthStats, 10032);
        if (fediVarE3 != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar22 = (fedk) fedjVar.instance;
            fedkVar22.I = fediVarE3;
            fedkVar22.b |= 2097152;
        }
        fedi fediVarE4 = dzkq.e(healthStats, 10033);
        if (fediVarE4 != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar23 = (fedk) fedjVar.instance;
            fedkVar23.J = fediVarE4;
            fedkVar23.b |= 4194304;
        }
        fedi fediVarE5 = dzkq.e(healthStats, 10034);
        if (fediVarE5 != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar24 = (fedk) fedjVar.instance;
            fedkVar24.K = fediVarE5;
            fedkVar24.b |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        fedi fediVarE6 = dzkq.e(healthStats, 10035);
        if (fediVarE6 != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar25 = (fedk) fedjVar.instance;
            fedkVar25.L = fediVarE6;
            fedkVar25.b |= 16777216;
        }
        fedi fediVarE7 = dzkq.e(healthStats, 10036);
        if (fediVarE7 != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar26 = (fedk) fedjVar.instance;
            fedkVar26.M = fediVarE7;
            fedkVar26.b |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        }
        fedi fediVarE8 = dzkq.e(healthStats, 10037);
        if (fediVarE8 != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar27 = (fedk) fedjVar.instance;
            fedkVar27.N = fediVarE8;
            fedkVar27.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        fedi fediVarE9 = dzkq.e(healthStats, 10038);
        if (fediVarE9 != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar28 = (fedk) fedjVar.instance;
            fedkVar28.O = fediVarE9;
            fedkVar28.b |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        }
        fedi fediVarE10 = dzkq.e(healthStats, 10039);
        if (fediVarE10 != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar29 = (fedk) fedjVar.instance;
            fedkVar29.P = fediVarE10;
            fedkVar29.b |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        }
        fedi fediVarE11 = dzkq.e(healthStats, 10040);
        if (fediVarE11 != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar30 = (fedk) fedjVar.instance;
            fedkVar30.Q = fediVarE11;
            fedkVar30.b |= 536870912;
        }
        fedi fediVarE12 = dzkq.e(healthStats, 10041);
        if (fediVarE12 != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar31 = (fedk) fedjVar.instance;
            fedkVar31.R = fediVarE12;
            fedkVar31.b |= 1073741824;
        }
        fedi fediVarE13 = dzkq.e(healthStats, 10042);
        if (fediVarE13 != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar32 = (fedk) fedjVar.instance;
            fedkVar32.S = fediVarE13;
            fedkVar32.b |= Integer.MIN_VALUE;
        }
        fedi fediVarE14 = dzkq.e(healthStats, 10043);
        if (fediVarE14 != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar33 = (fedk) fedjVar.instance;
            fedkVar33.T = fediVarE14;
            fedkVar33.c |= 1;
        }
        fedi fediVarE15 = dzkq.e(healthStats, 10044);
        if (fediVarE15 != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar34 = (fedk) fedjVar.instance;
            fedkVar34.U = fediVarE15;
            fedkVar34.c |= 2;
        }
        long jA20 = dzkq.a(healthStats, 10045);
        if (jA20 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar35 = (fedk) fedjVar.instance;
            fedkVar35.c |= 4;
            fedkVar35.V = jA20;
        }
        long jA21 = dzkq.a(healthStats, 10046);
        if (jA21 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar36 = (fedk) fedjVar.instance;
            fedkVar36.c |= 8;
            fedkVar36.W = jA21;
        }
        long jA22 = dzkq.a(healthStats, 10047);
        if (jA22 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar37 = (fedk) fedjVar.instance;
            fedkVar37.c |= 16;
            fedkVar37.X = jA22;
        }
        long jA23 = dzkq.a(healthStats, 10048);
        if (jA23 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar38 = (fedk) fedjVar.instance;
            fedkVar38.c |= 32;
            fedkVar38.Y = jA23;
        }
        long jA24 = dzkq.a(healthStats, 10049);
        if (jA24 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar39 = (fedk) fedjVar.instance;
            fedkVar39.c |= 64;
            fedkVar39.Z = jA24;
        }
        long jA25 = dzkq.a(healthStats, 10050);
        if (jA25 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar40 = (fedk) fedjVar.instance;
            fedkVar40.c |= 128;
            fedkVar40.aa = jA25;
        }
        long jA26 = dzkq.a(healthStats, 10051);
        if (jA26 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar41 = (fedk) fedjVar.instance;
            fedkVar41.c |= 256;
            fedkVar41.ab = jA26;
        }
        long jA27 = dzkq.a(healthStats, 10052);
        if (jA27 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar42 = (fedk) fedjVar.instance;
            fedkVar42.c |= 512;
            fedkVar42.ac = jA27;
        }
        long jA28 = dzkq.a(healthStats, 10053);
        if (jA28 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar43 = (fedk) fedjVar.instance;
            fedkVar43.c |= 1024;
            fedkVar43.ad = jA28;
        }
        long jA29 = dzkq.a(healthStats, 10054);
        if (jA29 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar44 = (fedk) fedjVar.instance;
            fedkVar44.c |= 2048;
            fedkVar44.ae = jA29;
        }
        long jA30 = dzkq.a(healthStats, 10055);
        if (jA30 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar45 = (fedk) fedjVar.instance;
            fedkVar45.c |= 4096;
            fedkVar45.af = jA30;
        }
        long jA31 = dzkq.a(healthStats, 10056);
        if (jA31 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar46 = (fedk) fedjVar.instance;
            fedkVar46.c |= 8192;
            fedkVar46.ag = jA31;
        }
        long jA32 = dzkq.a(healthStats, 10057);
        if (jA32 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar47 = (fedk) fedjVar.instance;
            fedkVar47.c |= 16384;
            fedkVar47.ah = jA32;
        }
        long jA33 = dzkq.a(healthStats, 10058);
        if (jA33 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar48 = (fedk) fedjVar.instance;
            fedkVar48.c |= 32768;
            fedkVar48.ai = jA33;
        }
        long jA34 = dzkq.a(healthStats, 10059);
        if (jA34 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar49 = (fedk) fedjVar.instance;
            fedkVar49.c = 65536 | fedkVar49.c;
            fedkVar49.aj = jA34;
        }
        fedi fediVarE16 = dzkq.e(healthStats, 10061);
        if (fediVarE16 != null) {
            fedjVar.copyOnWrite();
            fedk fedkVar50 = (fedk) fedjVar.instance;
            fedkVar50.ak = fediVarE16;
            fedkVar50.c |= 131072;
        }
        long jA35 = dzkq.a(healthStats, 10062);
        if (jA35 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar51 = (fedk) fedjVar.instance;
            fedkVar51.c |= 262144;
            fedkVar51.al = jA35;
        }
        long jA36 = dzkq.a(healthStats, 10063);
        if (jA36 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar52 = (fedk) fedjVar.instance;
            fedkVar52.c = 524288 | fedkVar52.c;
            fedkVar52.am = jA36;
        }
        long jA37 = dzkq.a(healthStats, 10064);
        if (jA37 != 0) {
            fedjVar.copyOnWrite();
            fedk fedkVar53 = (fedk) fedjVar.instance;
            fedkVar53.c |= 1048576;
            fedkVar53.an = jA37;
        }
        fedj fedjVar2 = (fedj) ((fedk) fedjVar.build()).toBuilder();
        DesugarCollections.unmodifiableList(((fedk) fedjVar2.instance).h);
        int i = 0;
        while (true) {
            dzku dzkuVar = dzkaVar.a;
            int size = ((fedk) fedjVar2.instance).h.size();
            dzkjVar = dzkuVar.b;
            if (i >= size) {
                break;
            }
            fedjVar2.u(i, dzkjVar.b(dzki.WAKELOCK, fedjVar2.e(i)));
            i++;
        }
        DesugarCollections.unmodifiableList(((fedk) fedjVar2.instance).i);
        for (int i2 = 0; i2 < ((fedk) fedjVar2.instance).i.size(); i2++) {
            fedjVar2.v(i2, dzkjVar.b(dzki.WAKELOCK, fedjVar2.f(i2)));
        }
        DesugarCollections.unmodifiableList(((fedk) fedjVar2.instance).j);
        for (int i3 = 0; i3 < ((fedk) fedjVar2.instance).j.size(); i3++) {
            fedjVar2.w(i3, dzkjVar.b(dzki.WAKELOCK, fedjVar2.g(i3)));
        }
        DesugarCollections.unmodifiableList(((fedk) fedjVar2.instance).k);
        for (int i4 = 0; i4 < ((fedk) fedjVar2.instance).k.size(); i4++) {
            fedjVar2.t(i4, dzkjVar.b(dzki.WAKELOCK, fedjVar2.d(i4)));
        }
        DesugarCollections.unmodifiableList(((fedk) fedjVar2.instance).l);
        for (int i5 = 0; i5 < ((fedk) fedjVar2.instance).l.size(); i5++) {
            fedjVar2.s(i5, dzkjVar.b(dzki.SYNC, fedjVar2.c(i5)));
        }
        DesugarCollections.unmodifiableList(((fedk) fedjVar2.instance).m);
        for (int i6 = 0; i6 < ((fedk) fedjVar2.instance).m.size(); i6++) {
            fedjVar2.q(i6, dzkjVar.b(dzki.JOB, fedjVar2.a(i6)));
        }
        DesugarCollections.unmodifiableList(((fedk) fedjVar2.instance).o);
        for (int i7 = 0; i7 < ((fedk) fedjVar2.instance).o.size(); i7++) {
            fedjVar2.r(i7, dzkjVar.b(dzki.SENSOR, fedjVar2.b(i7)));
        }
        return new dzks((fedk) fedjVar2.build(), l, l2, 757365213L, Long.valueOf(dzkaVar.c != null ? r1.hashCode() : 0L), fecrVar, null, feegVar, null);
    }
}
