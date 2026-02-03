package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxux implements dxui {
    private static final eksp a = eksp.c("GnpSdk");
    private final Context b;
    private final dxgy c;
    private final ejwi d;
    private final ejwi e;
    private final dxqw f;
    private final fcsu g;

    public dxux(Context context, dxgy dxgyVar, ejwi ejwiVar, ejwi ejwiVar2, dxqw dxqwVar, eosc eoscVar, fcsu fcsuVar) {
        context.getClass();
        eoscVar.getClass();
        fcsuVar.getClass();
        this.b = context;
        this.c = dxgyVar;
        this.d = ejwiVar;
        this.e = ejwiVar2;
        this.f = dxqwVar;
        this.g = fcsuVar;
    }

    private final evhe e() {
        List arrayList;
        List arrayList2;
        String str = "";
        evgs evgsVar = (evgs) evhe.a.createBuilder();
        evgsVar.getClass();
        Context context = this.b;
        float f = context.getResources().getDisplayMetrics().density;
        evgsVar.copyOnWrite();
        evhe evheVar = (evhe) evgsVar.instance;
        evheVar.b |= 1;
        evheVar.c = f;
        try {
            String str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            if (str2 != null) {
                str = str2;
            }
        } catch (PackageManager.NameNotFoundException e) {
            ((eksl) ((eksl) a.i()).g(e)).q("Couldn't get app version name.");
        }
        evgsVar.copyOnWrite();
        evhe evheVar2 = (evhe) evgsVar.instance;
        evheVar2.b |= 8;
        evheVar2.f = str;
        int i = Build.VERSION.SDK_INT;
        evgsVar.copyOnWrite();
        evhe evheVar3 = (evhe) evgsVar.instance;
        evheVar3.b |= 128;
        evheVar3.j = i;
        evgsVar.copyOnWrite();
        evhe evheVar4 = (evhe) evgsVar.instance;
        evheVar4.d = 3;
        evheVar4.b |= 2;
        evgsVar.copyOnWrite();
        evhe evheVar5 = (evhe) evgsVar.instance;
        evheVar5.b |= 4;
        evheVar5.e = "757365213";
        Context context2 = this.b;
        evgr evgrVar = new kwx(context2).i() ? evgr.ALLOWED : evgr.BANNED;
        evgrVar.getClass();
        evgsVar.copyOnWrite();
        evhe evheVar6 = (evhe) evgsVar.instance;
        evheVar6.o = evgrVar.d;
        evheVar6.b |= 1024;
        DesugarCollections.unmodifiableList(evheVar6.m).getClass();
        try {
            List listC = new kwx(context2).c();
            listC.getClass();
            arrayList = new ArrayList(fcva.p(listC, 10));
            Iterator it = listC.iterator();
            while (it.hasNext()) {
                NotificationChannel notificationChannelM = akc$$ExternalSyntheticApiModelOutline0.m(it.next());
                evgt evgtVar = (evgt) evgy.a.createBuilder();
                evgtVar.getClass();
                String id = notificationChannelM.getId();
                id.getClass();
                evgtVar.copyOnWrite();
                evgy evgyVar = (evgy) evgtVar.instance;
                evgyVar.b |= 1;
                evgyVar.c = id;
                int importance = notificationChannelM.getImportance();
                evgx evgxVar = importance != 0 ? importance != 1 ? importance != 2 ? importance != 3 ? importance != 4 ? importance != 5 ? evgx.IMPORTANCE_UNSPECIFIED : evgx.IMPORTANCE_MAX : evgx.IMPORTANCE_HIGH : evgx.IMPORTANCE_DEFAULT : evgx.IMPORTANCE_LOW : evgx.IMPORTANCE_MIN : evgx.IMPORTANCE_NONE;
                evgxVar.getClass();
                evgtVar.copyOnWrite();
                evgy evgyVar2 = (evgy) evgtVar.instance;
                evgyVar2.e = evgxVar.h;
                evgyVar2.b |= 4;
                evgv evgvVar = notificationChannelM.canShowBadge() ? evgv.TRUE : evgv.FALSE;
                evgvVar.getClass();
                evgtVar.copyOnWrite();
                evgy evgyVar3 = (evgy) evgtVar.instance;
                evgyVar3.f = evgvVar.d;
                evgyVar3.b |= 8;
                String group = notificationChannelM.getGroup();
                if (group != null && group.length() != 0) {
                    String group2 = notificationChannelM.getGroup();
                    group2.getClass();
                    evgtVar.copyOnWrite();
                    evgy evgyVar4 = (evgy) evgtVar.instance;
                    evgyVar4.b |= 2;
                    evgyVar4.d = group2;
                }
                evsn evsnVarBuild = evgtVar.build();
                evsnVarBuild.getClass();
                arrayList.add((evgy) evsnVarBuild);
            }
        } catch (NullPointerException e2) {
            ((eksl) ((eksl) a.j()).g(e2)).q("Failed to get notification channels from Android.");
            arrayList = fcvo.a;
        }
        evgsVar.copyOnWrite();
        evhe evheVar7 = (evhe) evgsVar.instance;
        evtg evtgVar = evheVar7.m;
        if (!evtgVar.c()) {
            evheVar7.m = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(arrayList, evheVar7.m);
        DesugarCollections.unmodifiableList(((evhe) evgsVar.instance).n).getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                List notificationChannelGroups = new kwx(this.b).d.getNotificationChannelGroups();
                notificationChannelGroups.getClass();
                arrayList2 = new ArrayList(fcva.p(notificationChannelGroups, 10));
                Iterator it2 = notificationChannelGroups.iterator();
                while (it2.hasNext()) {
                    NotificationChannelGroup notificationChannelGroupM = iy$$ExternalSyntheticApiModelOutline1.m(it2.next());
                    evgz evgzVar = (evgz) evhc.a.createBuilder();
                    evgzVar.getClass();
                    String id2 = notificationChannelGroupM.getId();
                    id2.getClass();
                    evgzVar.copyOnWrite();
                    evhc evhcVar = (evhc) evgzVar.instance;
                    evhcVar.b |= 1;
                    evhcVar.c = id2;
                    evhb evhbVar = notificationChannelGroupM.isBlocked() ? evhb.BANNED : evhb.ALLOWED;
                    evhbVar.getClass();
                    evgzVar.copyOnWrite();
                    evhc evhcVar2 = (evhc) evgzVar.instance;
                    evhcVar2.d = evhbVar.d;
                    evhcVar2.b |= 2;
                    evsn evsnVarBuild2 = evgzVar.build();
                    evsnVarBuild2.getClass();
                    arrayList2.add((evhc) evsnVarBuild2);
                }
            } catch (NullPointerException e3) {
                ((eksl) ((eksl) a.j()).g(e3)).q("Failed to get notification channel groups from Android.");
                arrayList2 = fcvo.a;
            }
        } else {
            arrayList2 = fcvo.a;
        }
        evgsVar.copyOnWrite();
        evhe evheVar8 = (evhe) evgsVar.instance;
        evtg evtgVar2 = evheVar8.n;
        if (!evtgVar2.c()) {
            evheVar8.n = evsn.mutableCopy(evtgVar2);
        }
        evpz.addAll(arrayList2, evheVar8.n);
        String str3 = ((dxgw) this.c).c;
        if (str3.length() != 0) {
            evgsVar.copyOnWrite();
            evhe evheVar9 = (evhe) evgsVar.instance;
            evheVar9.b |= 512;
            evheVar9.l = str3;
        }
        String str4 = Build.VERSION.RELEASE;
        if (str4 != null && str4.length() != 0) {
            String str5 = Build.VERSION.RELEASE;
            str5.getClass();
            evgsVar.copyOnWrite();
            evhe evheVar10 = (evhe) evgsVar.instance;
            evheVar10.b |= 16;
            evheVar10.g = str5;
        }
        String str6 = Build.ID;
        if (str6 != null && str6.length() != 0) {
            String str7 = Build.ID;
            str7.getClass();
            evgsVar.copyOnWrite();
            evhe evheVar11 = (evhe) evgsVar.instance;
            evheVar11.b |= 32;
            evheVar11.h = str7;
        }
        String str8 = Build.MODEL;
        if (str8 != null && str8.length() != 0) {
            String str9 = Build.MODEL;
            str9.getClass();
            evgsVar.copyOnWrite();
            evhe evheVar12 = (evhe) evgsVar.instance;
            evheVar12.b |= 64;
            evheVar12.i = str9;
        }
        String str10 = Build.MANUFACTURER;
        if (str10 != null && str10.length() != 0) {
            String str11 = Build.MANUFACTURER;
            str11.getClass();
            evgsVar.copyOnWrite();
            evhe evheVar13 = (evhe) evgsVar.instance;
            evheVar13.b |= 256;
            evheVar13.k = str11;
        }
        String strC = null;
        try {
            strC = devd.c(this.b.getContentResolver(), "device_country", null);
        } catch (SecurityException e4) {
            ((eksl) ((eksl) a.i()).g(e4)).q("Exception reading GServices 'device_country' key.");
        }
        if (strC != null && strC.length() != 0) {
            evgsVar.copyOnWrite();
            evhe evheVar14 = (evhe) evgsVar.instance;
            evheVar14.b |= 2048;
            evheVar14.p = strC;
        }
        Context context3 = this.b;
        evgp evgpVar = (evgp) dxus.a.fM(context3.getPackageManager().hasSystemFeature("org.chromium.arc") ? dxug.f : (dxuh.c() && context3.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) ? dxug.e : (context3.getPackageManager().hasSystemFeature("com.google.android.tv") || context3.getPackageManager().hasSystemFeature("android.hardware.type.television") || context3.getPackageManager().hasSystemFeature("android.software.leanback")) ? dxug.b : context3.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? dxug.d : context3.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? dxug.c : dxug.a);
        if (evgpVar != null) {
            evgsVar.copyOnWrite();
            evhe evheVar15 = (evhe) evgsVar.instance;
            evheVar15.s = evgpVar.g;
            evheVar15.b |= 16384;
        }
        evsn evsnVarBuild3 = evgsVar.build();
        evsnVarBuild3.getClass();
        return (evhe) evsnVarBuild3;
    }

    private final String f() {
        String languageTag = this.b.getResources().getConfiguration().getLocales().get(0).toLanguageTag();
        languageTag.getClass();
        return languageTag;
    }

    @Override // defpackage.dxui
    public final evdz a() {
        evhe evheVarE = e();
        evdt evdtVar = (evdt) evdz.a.createBuilder();
        evdtVar.getClass();
        String strF = f();
        evdtVar.copyOnWrite();
        evdz evdzVar = (evdz) evdtVar.instance;
        evdzVar.b |= 1;
        evdzVar.e = strF;
        String id = TimeZone.getDefault().getID();
        id.getClass();
        evdtVar.copyOnWrite();
        evdz evdzVar2 = (evdz) evdtVar.instance;
        evdzVar2.c = 4;
        evdzVar2.d = id;
        evdw evdwVar = (evdw) evdy.a.createBuilder();
        evdwVar.getClass();
        float f = evheVarE.c;
        evdwVar.copyOnWrite();
        evdy evdyVar = (evdy) evdwVar.instance;
        evdyVar.b |= 1;
        evdyVar.c = f;
        String str = evheVarE.f;
        str.getClass();
        evdwVar.copyOnWrite();
        evdy evdyVar2 = (evdy) evdwVar.instance;
        evdyVar2.b |= 8;
        evdyVar2.f = str;
        int i = evheVarE.j;
        evdwVar.copyOnWrite();
        evdy evdyVar3 = (evdy) evdwVar.instance;
        evdyVar3.b |= 128;
        evdyVar3.j = i;
        evdwVar.copyOnWrite();
        evdy evdyVar4 = (evdy) evdwVar.instance;
        evdyVar4.d = 3;
        evdyVar4.b |= 2;
        String str2 = evheVarE.e;
        str2.getClass();
        evdwVar.copyOnWrite();
        evdy evdyVar5 = (evdy) evdwVar.instance;
        evdyVar5.b |= 4;
        evdyVar5.e = str2;
        dxuj dxujVar = dxuj.a;
        evgr evgrVarB = evgr.b(evheVarE.o);
        if (evgrVarB == null) {
            evgrVarB = evgr.APP_BLOCK_STATE_UNKNOWN;
        }
        evdv evdvVar = (evdv) dxujVar.fM(evgrVarB);
        if (evdvVar != null) {
            evdwVar.copyOnWrite();
            evdy evdyVar6 = (evdy) evdwVar.instance;
            evdyVar6.n = evdvVar.d;
            evdyVar6.b |= 1024;
        }
        int i2 = (this.b.getResources().getConfiguration().uiMode & 48) != 32 ? 2 : 3;
        evdwVar.copyOnWrite();
        evdy evdyVar7 = (evdy) evdwVar.instance;
        evdyVar7.p = i2 - 1;
        evdyVar7.b |= 16384;
        String str3 = evheVarE.g;
        str3.getClass();
        if (str3.length() > 0) {
            String str4 = evheVarE.g;
            str4.getClass();
            evdwVar.copyOnWrite();
            evdy evdyVar8 = (evdy) evdwVar.instance;
            evdyVar8.b |= 16;
            evdyVar8.g = str4;
        }
        String str5 = evheVarE.h;
        str5.getClass();
        if (str5.length() > 0) {
            String str6 = evheVarE.h;
            str6.getClass();
            evdwVar.copyOnWrite();
            evdy evdyVar9 = (evdy) evdwVar.instance;
            evdyVar9.b = 32 | evdyVar9.b;
            evdyVar9.h = str6;
        }
        String str7 = evheVarE.i;
        str7.getClass();
        if (str7.length() > 0) {
            String str8 = evheVarE.i;
            str8.getClass();
            evdwVar.copyOnWrite();
            evdy evdyVar10 = (evdy) evdwVar.instance;
            evdyVar10.b |= 64;
            evdyVar10.i = str8;
        }
        String str9 = evheVarE.k;
        str9.getClass();
        if (str9.length() > 0) {
            String str10 = evheVarE.k;
            str10.getClass();
            evdwVar.copyOnWrite();
            evdy evdyVar11 = (evdy) evdwVar.instance;
            evdyVar11.b |= 256;
            evdyVar11.k = str10;
        }
        String str11 = evheVarE.p;
        str11.getClass();
        if (str11.length() > 0) {
            String str12 = evheVarE.p;
            str12.getClass();
            evdwVar.copyOnWrite();
            evdy evdyVar12 = (evdy) evdwVar.instance;
            evdyVar12.b |= 2048;
            evdyVar12.o = str12;
        }
        DesugarCollections.unmodifiableList(((evdy) evdwVar.instance).l).getClass();
        evtg<evgy> evtgVar = evheVarE.m;
        evtgVar.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(evtgVar, 10));
        for (evgy evgyVar : evtgVar) {
            evca evcaVar = (evca) evcf.a.createBuilder();
            evcaVar.getClass();
            String str13 = evgyVar.c;
            str13.getClass();
            evcaVar.copyOnWrite();
            evcf evcfVar = (evcf) evcaVar.instance;
            evcfVar.b |= 1;
            evcfVar.c = str13;
            dxur dxurVar = dxur.a;
            evgx evgxVarB = evgx.b(evgyVar.e);
            if (evgxVarB == null) {
                evgxVarB = evgx.IMPORTANCE_UNSPECIFIED;
            }
            evce evceVar = (evce) dxurVar.fM(evgxVarB);
            if (evceVar != null) {
                evcaVar.copyOnWrite();
                evcf evcfVar2 = (evcf) evcaVar.instance;
                evcfVar2.e = evceVar.h;
                evcfVar2.b |= 4;
            }
            dxup dxupVar = dxup.a;
            evgv evgvVarB = evgv.b(evgyVar.f);
            if (evgvVarB == null) {
                evgvVarB = evgv.UNSPECIFIED;
            }
            evcc evccVar = (evcc) dxupVar.fM(evgvVarB);
            if (evccVar != null) {
                evcaVar.copyOnWrite();
                evcf evcfVar3 = (evcf) evcaVar.instance;
                evcfVar3.f = evccVar.d;
                evcfVar3.b |= 8;
            }
            String str14 = evgyVar.d;
            str14.getClass();
            if (str14.length() > 0) {
                String str15 = evgyVar.d;
                str15.getClass();
                evcaVar.copyOnWrite();
                evcf evcfVar4 = (evcf) evcaVar.instance;
                evcfVar4.b |= 2;
                evcfVar4.d = str15;
            }
            evsn evsnVarBuild = evcaVar.build();
            evsnVarBuild.getClass();
            arrayList.add((evcf) evsnVarBuild);
        }
        evdwVar.copyOnWrite();
        evdy evdyVar13 = (evdy) evdwVar.instance;
        evtg evtgVar2 = evdyVar13.l;
        if (!evtgVar2.c()) {
            evdyVar13.l = evsn.mutableCopy(evtgVar2);
        }
        evpz.addAll(arrayList, evdyVar13.l);
        DesugarCollections.unmodifiableList(((evdy) evdwVar.instance).m).getClass();
        evtg<evhc> evtgVar3 = evheVarE.n;
        evtgVar3.getClass();
        ArrayList arrayList2 = new ArrayList(fcva.p(evtgVar3, 10));
        for (evhc evhcVar : evtgVar3) {
            evbw evbwVar = (evbw) evbz.a.createBuilder();
            evbwVar.getClass();
            String str16 = evhcVar.c;
            str16.getClass();
            evbwVar.copyOnWrite();
            evbz evbzVar = (evbz) evbwVar.instance;
            evbzVar.b |= 1;
            evbzVar.c = str16;
            dxuq dxuqVar = dxuq.a;
            evhb evhbVarB = evhb.b(evhcVar.d);
            if (evhbVarB == null) {
                evhbVarB = evhb.CHANNEL_GROUP_UNKNOWN;
            }
            evby evbyVar = (evby) dxuqVar.fM(evhbVarB);
            if (evbyVar != null) {
                evbwVar.copyOnWrite();
                evbz evbzVar2 = (evbz) evbwVar.instance;
                evbzVar2.d = evbyVar.d;
                evbzVar2.b |= 2;
            }
            evsn evsnVarBuild2 = evbwVar.build();
            evsnVarBuild2.getClass();
            arrayList2.add((evbz) evsnVarBuild2);
        }
        evdwVar.copyOnWrite();
        evdy evdyVar14 = (evdy) evdwVar.instance;
        evtg evtgVar4 = evdyVar14.m;
        if (!evtgVar4.c()) {
            evdyVar14.m = evsn.mutableCopy(evtgVar4);
        }
        evpz.addAll(arrayList2, evdyVar14.m);
        evsn evsnVarBuild3 = evdwVar.build();
        evsnVarBuild3.getClass();
        evdtVar.copyOnWrite();
        evdz evdzVar3 = (evdz) evdtVar.instance;
        evdzVar3.f = (evdy) evsnVarBuild3;
        evdzVar3.b |= 2;
        evsn evsnVarBuild4 = evdtVar.build();
        evsnVarBuild4.getClass();
        return (evdz) evsnVarBuild4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0102, code lost:
    
        if (r15 != r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dxui
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.dxvi r12, java.util.Set r13, defpackage.dxha r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 949
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxux.b(dxvi, java.util.Set, dxha, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.dxvi r6, defpackage.ejwi r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.dxuw
            if (r0 == 0) goto L13
            r0 = r8
            dxuw r0 = (defpackage.dxuw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dxuw r0 = new dxuw
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r8)     // Catch: java.lang.Exception -> L28
            goto L45
        L28:
            r6 = move-exception
            goto L49
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.fctl.b(r8)
            boolean r6 = r6.b()
            if (r6 == 0) goto L3c
            return r4
        L3c:
            ejwt r7 = (defpackage.ejwt) r7     // Catch: java.lang.Exception -> L28
            java.lang.Object r6 = r7.a     // Catch: java.lang.Exception -> L28
            r0.c = r3     // Catch: java.lang.Exception -> L28
            if (r1 == 0) goto L48
            r8 = r4
        L45:
            evqe r8 = (defpackage.evqe) r8     // Catch: java.lang.Exception -> L28
            return r8
        L48:
            return r4
        L49:
            eksp r7 = defpackage.dxux.a
            ekrw r7 = r7.i()
            java.lang.String r8 = "Failed getting device payload"
            defpackage.a.N(r7, r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxux.c(dxvi, ejwi, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ejwi r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dxuv
            if (r0 == 0) goto L13
            r0 = r7
            dxuv r0 = (defpackage.dxuv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dxuv r0 = new dxuv
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r7)     // Catch: java.lang.Exception -> L28
            goto L3e
        L28:
            r6 = move-exception
            goto L42
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.fctl.b(r7)
            ejwt r6 = (defpackage.ejwt) r6     // Catch: java.lang.Exception -> L28
            java.lang.Object r6 = r6.a     // Catch: java.lang.Exception -> L28
            r0.c = r3     // Catch: java.lang.Exception -> L28
            if (r1 == 0) goto L41
            r7 = r4
        L3e:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L28
            return r7
        L41:
            return r4
        L42:
            eksp r7 = defpackage.dxux.a
            ekrw r7 = r7.i()
            java.lang.String r0 = "Failed getting language code"
            defpackage.a.N(r7, r0, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxux.d(ejwi, fcxy):java.lang.Object");
    }
}
