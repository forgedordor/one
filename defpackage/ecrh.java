package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecrh extends ecro {
    private fbqm f;
    private String g;
    private final ecqy h;

    public ecrh(Context context, String str, String str2, String str3, ecqy ecqyVar) {
        super(context, str, str2, str3);
        this.h = ecqyVar;
    }

    static final fbrb e() {
        fbqx fbqxVar = fbrg.c;
        int i = fbrb.d;
        return new fbqw("Cookie", fbqxVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ejbe a() {
        /*
            r7 = this;
            android.content.Context r0 = r7.a
            java.lang.String r1 = r7.c
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r3 = "GoogleAuthProviderImpl"
            r4 = 0
            if (r2 == 0) goto L14
            java.lang.String r0 = "Account was not set."
            android.util.Log.w(r3, r0)
        L12:
            r0 = r4
            goto L40
        L14:
            ejas r2 = new ejas     // Catch: java.lang.Exception -> L32 com.google.android.gms.auth.UserRecoverableAuthException -> L39
            android.accounts.Account r5 = new android.accounts.Account     // Catch: java.lang.Exception -> L32 com.google.android.gms.auth.UserRecoverableAuthException -> L39
            java.lang.String r6 = "com.google"
            r5.<init>(r1, r6)     // Catch: java.lang.Exception -> L32 com.google.android.gms.auth.UserRecoverableAuthException -> L39
            java.lang.String r1 = "oauth2:https://www.googleapis.com/auth/supportcontent"
            int r6 = defpackage.dbmj.a     // Catch: java.lang.Exception -> L32 com.google.android.gms.auth.UserRecoverableAuthException -> L39
            java.lang.String r0 = defpackage.dbmq.d(r0, r5, r1)     // Catch: java.lang.Exception -> L32 com.google.android.gms.auth.UserRecoverableAuthException -> L39
            r2.<init>(r0, r4)     // Catch: java.lang.Exception -> L32 com.google.android.gms.auth.UserRecoverableAuthException -> L39
            ecpz r0 = new ecpz     // Catch: java.lang.Exception -> L32 com.google.android.gms.auth.UserRecoverableAuthException -> L39
            ejbe r1 = defpackage.ejbe.d(r2)     // Catch: java.lang.Exception -> L32 com.google.android.gms.auth.UserRecoverableAuthException -> L39
            r0.<init>(r1)     // Catch: java.lang.Exception -> L32 com.google.android.gms.auth.UserRecoverableAuthException -> L39
            goto L40
        L32:
            r0 = move-exception
            java.lang.String r1 = "Exception occurred while getting auth credentials"
            android.util.Log.e(r3, r1, r0)
            goto L12
        L39:
            r0 = move-exception
            java.lang.String r1 = "User recoverable exception happened while getting authentication token. You need to allowlist your application."
            android.util.Log.e(r3, r1, r0)
            goto L12
        L40:
            boolean r1 = r0 instanceof defpackage.ecpz
            if (r1 == 0) goto L47
            ejbe r0 = r0.a
            return r0
        L47:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecrh.a():ejbe");
    }

    public final fbnd b(ejbe ejbeVar) {
        String strE;
        ecqm ecqmVar;
        try {
            long j = ecse.a;
            if (TextUtils.isEmpty(this.g) && (ecqmVar = ecqc.a.c) != null) {
                this.g = ecqmVar.a();
            }
            this.f = fbxn.m(ecqc.a.a(), 443, this.h.a).a();
            String str = this.g;
            fbrg fbrgVar = new fbrg();
            ecsj ecsjVar = ecrz.c;
            if (!ecrz.b(fble.a.get().b(ecrz.b))) {
                fbrgVar.h(e(), str);
            } else if (ejbeVar == null && !TextUtils.isEmpty(str)) {
                fbrgVar.h(e(), str);
            }
            String str2 = this.d;
            if (!TextUtils.isEmpty(str2)) {
                fbqx fbqxVar = fbrg.c;
                int i = fbrb.d;
                fbrgVar.h(new fbqw("X-Goog-Api-Key", fbqxVar), str2);
            }
            Context context = this.a;
            try {
                strE = ecse.e(context.getPackageManager().getPackageInfo(context.getPackageName(), 64));
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("SurveyUtils", "Package not found.", e);
                strE = null;
            }
            if (!TextUtils.isEmpty(strE)) {
                fbqx fbqxVar2 = fbrg.c;
                int i2 = fbrb.d;
                fbrgVar.h(new fbqw("X-Android-Cert", fbqxVar2), strE);
            }
            String packageName = this.a.getPackageName();
            if (!TextUtils.isEmpty(packageName)) {
                fbqx fbqxVar3 = fbrg.c;
                int i3 = fbrb.d;
                fbrgVar.h(new fbqw("X-Android-Package", fbqxVar3), packageName);
            }
            fbqx fbqxVar4 = fbrg.c;
            int i4 = fbrb.d;
            fbrgVar.h(new fbqw("Authority", fbqxVar4), ecqc.a.a());
            return fbnk.b(this.f, new fcrz(fbrgVar));
        } catch (Exception e2) {
            Log.e("NetworkCallerGrpc", "Could not get managed channel.", e2);
            d();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void c(defpackage.exne r10, defpackage.ecsc r11) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecrh.c(exne, ecsc):void");
    }

    public final void d() {
        fbqm fbqmVar = this.f;
        if (fbqmVar != null) {
            fbqmVar.d();
        }
    }

    public final void f(exna exnaVar, ecsc ecscVar) {
        long j = ecse.a;
        String str = this.c;
        String str2 = true == TextUtils.isEmpty(str) ? null : str;
        ecsj ecsjVar = ecrz.c;
        if (ecrz.c(fbka.b(ecrz.b))) {
            exhf exhfVar = (exhf) exhg.a.createBuilder();
            char c = 2;
            if ((exnaVar.b & 1) != 0) {
                expg expgVar = exnaVar.c;
                if (expgVar == null) {
                    expgVar = expg.a;
                }
                exel exelVar = (exel) exfg.a.createBuilder();
                if ((expgVar.b & 1) != 0) {
                    evrj evrjVar = expgVar.e;
                    if (evrjVar == null) {
                        evrjVar = evrj.a;
                    }
                    exelVar.copyOnWrite();
                    exfg exfgVar = (exfg) exelVar.instance;
                    evrjVar.getClass();
                    exfgVar.e = evrjVar;
                    exfgVar.b |= 1;
                }
                int i = expgVar.c;
                int i2 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
                if (i2 == 0) {
                    throw null;
                }
                int i3 = i2 - 1;
                if (i3 == 0) {
                    exff exffVar = exff.a;
                    exelVar.copyOnWrite();
                    exfg exfgVar2 = (exfg) exelVar.instance;
                    exffVar.getClass();
                    exfgVar2.d = exffVar;
                    exfgVar2.c = 2;
                } else if (i3 == 1) {
                    expb expbVar = i == 3 ? (expb) expgVar.d : expb.a;
                    exfa exfaVar = (exfa) exfb.a.createBuilder();
                    if ((expbVar.b & 2) != 0) {
                        expy expyVar = expbVar.c;
                        if (expyVar == null) {
                            expyVar = expy.a;
                        }
                        exgh exghVar = (exgh) exgk.a.createBuilder();
                        String str3 = expyVar.d;
                        exghVar.copyOnWrite();
                        exgk exgkVar = (exgk) exghVar.instance;
                        str3.getClass();
                        exgkVar.d = str3;
                        if ((expyVar.b & 1) != 0) {
                            exgi exgiVar = (exgi) exgj.a.createBuilder();
                            expx expxVar = expyVar.c;
                            if (expxVar == null) {
                                expxVar = expx.a;
                            }
                            evtg evtgVar = expxVar.c;
                            exgiVar.copyOnWrite();
                            exgj exgjVar = (exgj) exgiVar.instance;
                            evtg evtgVar2 = exgjVar.b;
                            if (!evtgVar2.c()) {
                                exgjVar.b = evsn.mutableCopy(evtgVar2);
                            }
                            evpz.addAll(evtgVar, exgjVar.b);
                            exghVar.copyOnWrite();
                            exgk exgkVar2 = (exgk) exghVar.instance;
                            exgj exgjVar2 = (exgj) exgiVar.build();
                            exgjVar2.getClass();
                            exgkVar2.c = exgjVar2;
                            exgkVar2.b |= 1;
                        }
                        exfaVar.copyOnWrite();
                        exfb exfbVar = (exfb) exfaVar.instance;
                        exgk exgkVar3 = (exgk) exghVar.build();
                        exgkVar3.getClass();
                        exfbVar.c = exgkVar3;
                        exfbVar.b |= 1;
                    }
                    if ((expbVar.b & 4) != 0) {
                        exqu exquVar = expbVar.d;
                        if (exquVar == null) {
                            exquVar = exqu.a;
                        }
                        exgp exgpVar = (exgp) exha.a.createBuilder();
                        if ((exquVar.b & 1) != 0) {
                            exqt exqtVar = exquVar.c;
                            if (exqtVar == null) {
                                exqtVar = exqt.a;
                            }
                            exgq exgqVar = (exgq) exgz.a.createBuilder();
                            if ((exqtVar.b & 2) != 0) {
                                exqs exqsVar = exqtVar.c;
                                if (exqsVar == null) {
                                    exqsVar = exqs.a;
                                }
                                exgr exgrVar = (exgr) exgy.a.createBuilder();
                                if ((exqsVar.b & 1) != 0) {
                                    exqr exqrVar = exqsVar.c;
                                    if (exqrVar == null) {
                                        exqrVar = exqr.a;
                                    }
                                    exgw exgwVar = (exgw) exgx.a.createBuilder();
                                    String str4 = exqrVar.b;
                                    exgwVar.copyOnWrite();
                                    exgx exgxVar = (exgx) exgwVar.instance;
                                    str4.getClass();
                                    exgxVar.b = str4;
                                    String str5 = exqrVar.c;
                                    exgwVar.copyOnWrite();
                                    exgx exgxVar2 = (exgx) exgwVar.instance;
                                    str5.getClass();
                                    exgxVar2.c = str5;
                                    String str6 = exqrVar.d;
                                    exgwVar.copyOnWrite();
                                    exgx exgxVar3 = (exgx) exgwVar.instance;
                                    str6.getClass();
                                    exgxVar3.d = str6;
                                    String str7 = exqrVar.e;
                                    exgwVar.copyOnWrite();
                                    exgx exgxVar4 = (exgx) exgwVar.instance;
                                    str7.getClass();
                                    exgxVar4.e = str7;
                                    String str8 = exqrVar.f;
                                    exgwVar.copyOnWrite();
                                    exgx exgxVar5 = (exgx) exgwVar.instance;
                                    str8.getClass();
                                    exgxVar5.f = str8;
                                    exgx exgxVar6 = (exgx) exgwVar.build();
                                    exgrVar.copyOnWrite();
                                    exgy exgyVar = (exgy) exgrVar.instance;
                                    exgxVar6.getClass();
                                    exgyVar.c = exgxVar6;
                                    exgyVar.b |= 1;
                                }
                                if ((exqsVar.b & 2) != 0) {
                                    exqp exqpVar = exqsVar.d;
                                    if (exqpVar == null) {
                                        exqpVar = exqp.a;
                                    }
                                    exgs exgsVar = (exgs) exgv.a.createBuilder();
                                    if (exqpVar.b.size() > 0) {
                                        for (exqo exqoVar : exqpVar.b) {
                                            exgt exgtVar = (exgt) exgu.a.createBuilder();
                                            String str9 = exqoVar.b;
                                            exgtVar.copyOnWrite();
                                            char c2 = c;
                                            exgu exguVar = (exgu) exgtVar.instance;
                                            str9.getClass();
                                            exguVar.b = str9;
                                            String str10 = exqoVar.c;
                                            exgtVar.copyOnWrite();
                                            exgu exguVar2 = (exgu) exgtVar.instance;
                                            str10.getClass();
                                            exguVar2.c = str10;
                                            exgu exguVar3 = (exgu) exgtVar.build();
                                            exgsVar.copyOnWrite();
                                            exgv exgvVar = (exgv) exgsVar.instance;
                                            exguVar3.getClass();
                                            evtg evtgVar3 = exgvVar.b;
                                            if (!evtgVar3.c()) {
                                                exgvVar.b = evsn.mutableCopy(evtgVar3);
                                            }
                                            exgvVar.b.add(exguVar3);
                                            c = c2;
                                        }
                                    }
                                    exgrVar.copyOnWrite();
                                    exgy exgyVar2 = (exgy) exgrVar.instance;
                                    exgv exgvVar2 = (exgv) exgsVar.build();
                                    exgvVar2.getClass();
                                    exgyVar2.d = exgvVar2;
                                    exgyVar2.b |= 2;
                                }
                                exgqVar.copyOnWrite();
                                exgz exgzVar = (exgz) exgqVar.instance;
                                exgy exgyVar3 = (exgy) exgrVar.build();
                                exgyVar3.getClass();
                                exgzVar.c = exgyVar3;
                                exgzVar.b |= 2;
                            }
                            exgpVar.copyOnWrite();
                            exha exhaVar = (exha) exgpVar.instance;
                            exgz exgzVar2 = (exgz) exgqVar.build();
                            exgzVar2.getClass();
                            exhaVar.c = exgzVar2;
                            exhaVar.b |= 1;
                        }
                        exfaVar.copyOnWrite();
                        exfb exfbVar2 = (exfb) exfaVar.instance;
                        exha exhaVar2 = (exha) exgpVar.build();
                        exhaVar2.getClass();
                        exfbVar2.d = exhaVar2;
                        exfbVar2.b |= 2;
                    }
                    exelVar.copyOnWrite();
                    exfg exfgVar3 = (exfg) exelVar.instance;
                    exfb exfbVar3 = (exfb) exfaVar.build();
                    exfbVar3.getClass();
                    exfgVar3.d = exfbVar3;
                    exfgVar3.c = 3;
                } else if (i3 == 2) {
                    exem exemVar = (exem) exen.a.createBuilder();
                    boolean z = (expgVar.c == 4 ? (exol) expgVar.d : exol.a).b;
                    exemVar.copyOnWrite();
                    ((exen) exemVar.instance).b = z;
                    exelVar.copyOnWrite();
                    exfg exfgVar4 = (exfg) exelVar.instance;
                    exen exenVar = (exen) exemVar.build();
                    exenVar.getClass();
                    exfgVar4.d = exenVar;
                    exfgVar4.c = 4;
                } else if (i3 == 3) {
                    exoz exozVar = i == 5 ? (exoz) expgVar.d : exoz.a;
                    exeo exeoVar = (exeo) exez.a.createBuilder();
                    int i4 = exozVar.d;
                    exeoVar.copyOnWrite();
                    ((exez) exeoVar.instance).d = i4;
                    int i5 = exozVar.b;
                    int iA = exom.a(i5);
                    int i6 = iA - 1;
                    if (iA == 0) {
                        throw null;
                    }
                    if (i6 == 0) {
                        exoy exoyVar = i5 == 2 ? (exoy) exozVar.c : exoy.a;
                        exex exexVar = (exex) exey.a.createBuilder();
                        if ((exoyVar.b & 1) != 0) {
                            exow exowVar = exoyVar.c;
                            if (exowVar == null) {
                                exowVar = exow.a;
                            }
                            exew exewVarA = ecsb.a(exowVar);
                            exexVar.copyOnWrite();
                            exey exeyVar = (exey) exexVar.instance;
                            exewVarA.getClass();
                            exeyVar.c = exewVarA;
                            exeyVar.b |= 1;
                        }
                        exeoVar.copyOnWrite();
                        exez exezVar = (exez) exeoVar.instance;
                        exey exeyVar2 = (exey) exexVar.build();
                        exeyVar2.getClass();
                        exezVar.c = exeyVar2;
                        exezVar.b = 2;
                    } else if (i6 == 1) {
                        exop exopVar = i5 == 3 ? (exop) exozVar.c : exop.a;
                        exep exepVar = (exep) exeq.a.createBuilder();
                        if (exopVar.b.size() > 0) {
                            Iterator<E> it = exopVar.b.iterator();
                            while (it.hasNext()) {
                                exew exewVarA2 = ecsb.a((exow) it.next());
                                exepVar.copyOnWrite();
                                exeq exeqVar = (exeq) exepVar.instance;
                                exewVarA2.getClass();
                                evtg evtgVar4 = exeqVar.b;
                                if (!evtgVar4.c()) {
                                    exeqVar.b = evsn.mutableCopy(evtgVar4);
                                }
                                exeqVar.b.add(exewVarA2);
                            }
                        }
                        exeoVar.copyOnWrite();
                        exez exezVar2 = (exez) exeoVar.instance;
                        exeq exeqVar2 = (exeq) exepVar.build();
                        exeqVar2.getClass();
                        exezVar2.c = exeqVar2;
                        exezVar2.b = 3;
                    } else if (i6 == 2) {
                        exot exotVar = i5 == 4 ? (exot) exozVar.c : exot.a;
                        exet exetVar = (exet) exeu.a.createBuilder();
                        if ((exotVar.b & 1) != 0) {
                            exow exowVar2 = exotVar.c;
                            if (exowVar2 == null) {
                                exowVar2 = exow.a;
                            }
                            exew exewVarA3 = ecsb.a(exowVar2);
                            exetVar.copyOnWrite();
                            exeu exeuVar = (exeu) exetVar.instance;
                            exewVarA3.getClass();
                            exeuVar.c = exewVarA3;
                            exeuVar.b |= 1;
                        }
                        exeoVar.copyOnWrite();
                        exez exezVar3 = (exez) exeoVar.instance;
                        exeu exeuVar2 = (exeu) exetVar.build();
                        exeuVar2.getClass();
                        exezVar3.c = exeuVar2;
                        exezVar3.b = 4;
                    } else if (i6 == 3) {
                        exer exerVar = (exer) exes.a.createBuilder();
                        String str11 = (exozVar.b == 5 ? (exor) exozVar.c : exor.a).b;
                        exerVar.copyOnWrite();
                        exes exesVar = (exes) exerVar.instance;
                        str11.getClass();
                        exesVar.b = str11;
                        exeoVar.copyOnWrite();
                        exez exezVar4 = (exez) exeoVar.instance;
                        exes exesVar2 = (exes) exerVar.build();
                        exesVar2.getClass();
                        exezVar4.c = exesVar2;
                        exezVar4.b = 5;
                    }
                    exelVar.copyOnWrite();
                    exfg exfgVar5 = (exfg) exelVar.instance;
                    exez exezVar5 = (exez) exeoVar.build();
                    exezVar5.getClass();
                    exfgVar5.d = exezVar5;
                    exfgVar5.c = 5;
                } else if (i3 == 4) {
                    exfd exfdVar = exfd.a;
                    exelVar.copyOnWrite();
                    exfg exfgVar6 = (exfg) exelVar.instance;
                    exfdVar.getClass();
                    exfgVar6.d = exfdVar;
                    exfgVar6.c = 6;
                }
                exhfVar.copyOnWrite();
                exhg exhgVar = (exhg) exhfVar.instance;
                exfg exfgVar7 = (exfg) exelVar.build();
                exfgVar7.getClass();
                exhgVar.c = exfgVar7;
                exhgVar.b |= 1;
            }
            if ((exnaVar.b & 2) != 0) {
                exhb exhbVar = (exhb) exhc.a.createBuilder();
                exqw exqwVar = exnaVar.d;
                if (exqwVar == null) {
                    exqwVar = exqw.a;
                }
                String str12 = exqwVar.b;
                exhbVar.copyOnWrite();
                exhc exhcVar = (exhc) exhbVar.instance;
                str12.getClass();
                exhcVar.b = str12;
                exqw exqwVar2 = exnaVar.d;
                if (exqwVar2 == null) {
                    exqwVar2 = exqw.a;
                }
                evqs evqsVar = exqwVar2.c;
                exhbVar.copyOnWrite();
                exhc exhcVar2 = (exhc) exhbVar.instance;
                evqsVar.getClass();
                exhcVar2.c = evqsVar;
                exhc exhcVar3 = (exhc) exhbVar.build();
                exhfVar.copyOnWrite();
                exhg exhgVar2 = (exhg) exhfVar.instance;
                exhcVar3.getClass();
                exhgVar2.d = exhcVar3;
                exhgVar2.b |= 2;
            }
            Context context = this.a;
            ecsa ecsaVarA = ecsa.a();
            exfh exfhVar = (exfh) exfi.a.createBuilder();
            exfhVar.copyOnWrite();
            exfi exfiVar = (exfi) exfhVar.instance;
            exhg exhgVar3 = (exhg) exhfVar.build();
            exhgVar3.getClass();
            exfiVar.c = exhgVar3;
            exfiVar.b = 3;
            exhi exhiVar = exhi.a;
            exfhVar.copyOnWrite();
            exfi exfiVar2 = (exfi) exfhVar.instance;
            exhiVar.getClass();
            exfiVar2.e = exhiVar;
            exfiVar2.d = 5;
            ecsaVarA.b((exfi) exfhVar.build(), ecscVar.b(), ecscVar.a(), context, str2);
        }
    }

    public final /* synthetic */ void g(faei faeiVar, ecqe ecqeVar) {
        fbrk fbrkVarA;
        try {
            ejbe ejbeVarA = a();
            ecqc ecqcVar = ecqc.a;
            boolean z = ecqcVar.b;
            ecqcVar.b = true;
            fbnd fbndVarB = b(ejbeVarA);
            ecqcVar.b = z;
            if (fbndVarB == null) {
                Log.e("NetworkCallerGrpc", "Could not get channel for survey startup config.");
                ecqcVar.b = false;
                return;
            }
            faew faewVarA = faex.a(fbndVarB);
            fbnd fbndVar = faewVarA.a;
            fbrk fbrkVar = faex.e;
            if (fbrkVar == null) {
                synchronized (faex.class) {
                    fbrkVarA = faex.e;
                    if (fbrkVarA == null) {
                        fbrh fbrhVarA = fbrk.a();
                        fbrhVarA.c = fbrj.UNARY;
                        fbrhVarA.d = fbrk.c("google.internal.feedback.v1.SurveyService", "GetSurveyStartupConfig");
                        fbrhVarA.b();
                        faei faeiVar2 = faei.a;
                        evrr evrrVar = fcrj.a;
                        fbrhVarA.a = new fcrh(faeiVar2);
                        fbrhVarA.b = new fcrh(faek.a);
                        fbrkVarA = fbrhVarA.a();
                        faex.e = fbrkVarA;
                    }
                }
                fbrkVar = fbrkVarA;
            }
            eork.r(fcrw.a(fbndVar.a(fbrkVar, faewVarA.b), faeiVar), new ecrg(this, ecqeVar), ecqx.a());
        } catch (UnsupportedOperationException e) {
            Log.e("NetworkCallerGrpc", "The configured transport is not supported: ".concat(e.toString()));
            i(5);
        }
    }
}
