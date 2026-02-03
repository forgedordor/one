package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.ui.debug.cloudstore.analysisui.CmsSyncAnalysisActivity;
import com.google.android.apps.messaging.ui.debug.cloudstore.d2d.D2dToolsActivity;
import com.google.android.apps.messaging.ui.debug.cloudstore.keyretrievalclient.KeyRetrievalClientActivity;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxvq implements cxuq {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/debug/cloudstore/CloudStoreDebugMenuProviderImpl");
    public final cxwj b;
    public final fcsu c;
    public final autx d;
    public final fdjx e;
    public final fcyh f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final cedc j;
    public final fcsu k;
    public final fcsu l;
    public final fcsu m;
    public final fcsu n;
    private final apoy o;
    private final fcsu p;
    private final fctc q;
    private final fctc r;

    public cxvq(cxwj cxwjVar, cyfw cyfwVar, fcsu fcsuVar, autx autxVar, fdjx fdjxVar, fcyh fcyhVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, cedc cedcVar, fcsu fcsuVar5, fcsu fcsuVar6, apoy apoyVar, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9) {
        cyfwVar.getClass();
        fcsuVar.getClass();
        autxVar.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        cedcVar.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        fcsuVar9.getClass();
        this.b = cxwjVar;
        this.c = fcsuVar;
        this.d = autxVar;
        this.e = fdjxVar;
        this.f = fcyhVar;
        this.g = fcsuVar2;
        this.h = fcsuVar3;
        this.i = fcsuVar4;
        this.j = cedcVar;
        this.k = fcsuVar5;
        this.l = fcsuVar6;
        this.o = apoyVar;
        this.p = fcsuVar7;
        this.m = fcsuVar8;
        this.n = fcsuVar9;
        this.q = fctd.a(new fdae() { // from class: cxur
            @Override // defpackage.fdae
            public final Object invoke() {
                cmgg cmggVarC = cmgh.c();
                cmggVarC.d(cmfn.CMS_SETTINGS);
                cmggVarC.f(aumq.a);
                return ((cmgk) this.a.c.b()).a(cmggVarC.a());
            }
        });
        this.r = fctd.a(new fdae() { // from class: cxvc
            @Override // defpackage.fdae
            public final Object invoke() {
                return (cxuo) fdct.b((Optional) ((eyig) this.a.m).a);
            }
        });
    }

    private final void c(MenuItem menuItem, final Activity activity, final fdap fdapVar) {
        menuItem.setOnMenuItemClickListener(new eige((eigp) this.p.b(), "CloudStoreDebugMenuClick", new MenuItem.OnMenuItemClickListener() { // from class: cxve
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem2) {
                menuItem2.getClass();
                fdapVar.invoke(cyfw.a(activity, Optional.empty(), Optional.empty()));
                return false;
            }
        }));
    }

    @Override // defpackage.cxuq
    public final void a(Menu menu, final Activity activity) {
        menu.getClass();
        activity.getClass();
        SubMenu subMenuAddSubMenu = menu.addSubMenu("CMS Sync & Backup");
        subMenuAddSubMenu.getClass();
        boolean zJ = this.d.j((aumq) b().l());
        if (zJ) {
            final Intent intentA = aiiw.c(activity, CmsSyncAnalysisActivity.class, "android.intent.action.VIEW").a();
            intentA.getClass();
            MenuItem menuItemAdd = subMenuAddSubMenu.add("Backup & Restore Analysis");
            menuItemAdd.getClass();
            c(menuItemAdd, activity, new fdap() { // from class: cxvf
                @Override // defpackage.fdap
                public final Object invoke(Object obj) throws IOException {
                    ((cyfv) obj).getClass();
                    eiid.o(activity, intentA);
                    return fctx.a;
                }
            });
        }
        if (!cqbe.g()) {
            MenuItem menuItemAdd2 = subMenuAddSubMenu.add("Log local CMS keys");
            menuItemAdd2.getClass();
            c(menuItemAdd2, activity, new fdap() { // from class: cxus
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ((cyfv) obj).getClass();
                    cqce cqceVarG = cqce.g("BugleCms", "DebugUtils");
                    cxvq cxvqVar = this.a;
                    auvw.k(cxvqVar.e, null, null, new cxvp(cxvqVar, cqceVarG, null), 3);
                    return fctx.a;
                }
            });
        }
        MenuItem menuItemAdd3 = subMenuAddSubMenu.add("Show CMS Settings Data");
        menuItemAdd3.getClass();
        c(menuItemAdd3, activity, new fdap() { // from class: cxut
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                cyfv cyfvVar = (cyfv) obj;
                cyfvVar.getClass();
                cxvq cxvqVar = this.a;
                aumq aumqVar = (aumq) cxvqVar.b().l();
                String strB = cxvqVar.d.b(aumqVar);
                cxwk cxwkVar = new cxwk(cyfvVar, activity);
                auml aumlVarB = auml.b(aumqVar.l);
                if (aumlVarB == null) {
                    aumlVarB = auml.UNSPECIFIED_STATUS;
                }
                cxwkVar.a("MD Feature Enable Status", aumlVarB.name());
                auml aumlVarB2 = auml.b(aumqVar.r);
                if (aumlVarB2 == null) {
                    aumlVarB2 = auml.UNSPECIFIED_STATUS;
                }
                cxwkVar.a("B&R Feature Enable Status", aumlVarB2.name());
                cxwkVar.a("Is MultiDevice enabled", String.valueOf(aumqVar.e));
                cxwkVar.a("Is B&R enabled", String.valueOf(aumqVar.q));
                cxwkVar.a("Is B&R preparing to start", String.valueOf(((aukg) cxvqVar.n.b()).a()));
                cxwkVar.a("Initial sync status", strB);
                aumj aumjVarB = aumj.b(aumqVar.y);
                if (aumjVarB == null) {
                    aumjVarB = aumj.ENCRYPTION_STATUS_UNSPECIFIED;
                }
                String strSubstring = aumjVarB.name().substring(18);
                strSubstring.getClass();
                cxwkVar.a("Encryption status", strSubstring);
                cxwkVar.a("HasFolsomConsent", String.valueOf(aumqVar.D));
                String str = aumqVar.h;
                str.getClass();
                cxwkVar.a("Restore page token", str);
                StringBuilder sb = new StringBuilder("R:(P:");
                ausj ausjVar = aumqVar.C;
                if (ausjVar == null) {
                    ausjVar = ausj.a;
                }
                ausjVar.getClass();
                sb.append(ausjVar.l);
                sb.append("/");
                sb.append(ausjVar.k);
                sb.append(",C:");
                sb.append(ausjVar.h);
                sb.append("/");
                sb.append(ausjVar.g);
                sb.append(",M:");
                sb.append(ausjVar.d);
                sb.append("/");
                sb.append(ausjVar.c);
                sb.append(")\nB:(P:");
                sb.append(ausjVar.n);
                sb.append("/");
                sb.append(ausjVar.m);
                sb.append(",C:");
                sb.append(ausjVar.j);
                sb.append("/");
                sb.append(ausjVar.i);
                sb.append(",M:");
                sb.append(ausjVar.f);
                sb.append("/");
                sb.append(ausjVar.e);
                sb.append(")");
                cxwkVar.a("Initial sync progress data", sb.toString());
                cxwkVar.a("Record Initial Sync Progress", String.valueOf(aumqVar.B));
                String str2 = aumqVar.j;
                str2.getClass();
                ekrw ekrwVarH = cxvq.a.h();
                ekrwVarH.X(eksq.a, "BugleCms");
                ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/ui/debug/cloudstore/CloudStoreDebugMenuProviderImpl", "showCmsSettingsData", 309, "CloudStoreDebugMenuProviderImpl.kt")).t("Cms session id = %s", str2);
                cxwkVar.a("Session id", str2);
                evtg evtgVar = aumqVar.L;
                evtgVar.getClass();
                cyfv cyfvVar2 = cxwkVar.a;
                int i = cxwkVar.c + 1;
                cxwkVar.c = i;
                cxwkVar.b(cyfvVar2.b(i + ". Previous session ids:"));
                Activity activity2 = cyfvVar2.a;
                ru ruVar = new ru(activity2);
                ruVar.setAdapter((SpinnerAdapter) new ArrayAdapter(activity2, R.layout.simple_spinner_dropdown_item, evtgVar));
                ruVar.setSelection(0, false);
                cxwkVar.b(ruVar);
                String str3 = aumqVar.g;
                str3.getClass();
                cxwkVar.a("Device id", str3);
                aump aumpVar = aumqVar.z;
                if (aumpVar == null) {
                    aumpVar = aump.a;
                }
                cxwkVar.a("Failed-to-back-up count due to storage", String.valueOf(aumpVar.c));
                evvp evvpVar = aumqVar.I;
                if (evvpVar == null) {
                    evvpVar = evvp.a;
                }
                cxwkVar.a("cmsD2DTimestamp", evxc.h(evvpVar));
                evvp evvpVar2 = aumqVar.H;
                if (evvpVar2 == null) {
                    evvpVar2 = evvp.a;
                }
                cxwkVar.a("dailyRetrievedCmsTimestamp", evxc.h(evvpVar2));
                String str4 = aumqVar.K;
                str4.getClass();
                cxwkVar.a("priorToCmsGaiaId", str4);
                String str5 = aumqVar.J;
                str5.getClass();
                cxwkVar.a("priorToDeviceId", str5);
                evvp evvpVar3 = aumqVar.M;
                if (evvpVar3 == null) {
                    evvpVar3 = evvp.a;
                }
                cxwkVar.a("cmsOptOutTimestamp", evxc.h(evvpVar3));
                cxwkVar.a("deviceUserId", aumqVar.Q.toString());
                cxwkVar.b.create().show();
                return fctx.a;
            }
        });
        if (cqbe.e() || cqbe.f()) {
            MenuItem menuItemAdd4 = subMenuAddSubMenu.add("Set CMS settings data");
            menuItemAdd4.getClass();
            c(menuItemAdd4, activity, new fdap() { // from class: cxuu
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    cyfv cyfvVar = (cyfv) obj;
                    cyfvVar.getClass();
                    Activity activity2 = cyfvVar.a;
                    AlertDialog.Builder builder = new AlertDialog.Builder(activity2);
                    ScrollView scrollView = new ScrollView(activity2);
                    LinearLayout linearLayout = new LinearLayout(activity2);
                    linearLayout.setOrientation(1);
                    scrollView.addView(linearLayout);
                    builder.setView(scrollView);
                    cpyb cpybVar = cpyb.MULTI_DEVICE;
                    cxwj cxwjVar = this.a.b;
                    cxwjVar.d(cyfvVar, "Pick MD status", linearLayout, cpybVar);
                    cpyb cpybVar2 = cpyb.BACKUP_AND_RESTORE;
                    cxwjVar.d(cyfvVar, "Pick B&R status", linearLayout, cpybVar2);
                    cxwjVar.c(cyfvVar, "Pick MD on/off", linearLayout, cpybVar);
                    cxwjVar.c(cyfvVar, "Pick B&R on/off", linearLayout, cpybVar2);
                    TextView textViewB = cyfvVar.b("Pick Initial Sync Status");
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                    layoutParams.weight = 1.0f;
                    layoutParams.gravity = 17;
                    textViewB.setTypeface(textViewB.getTypeface(), 1);
                    textViewB.setLayoutParams(layoutParams);
                    textViewB.setPadding(0, 5, 0, 5);
                    linearLayout.addView(textViewB);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("Not selected");
                    Stream stream = DesugarArrays.stream(autt.values());
                    final fdap fdapVar = new fdap() { // from class: autu
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            autt auttVar = (autt) obj2;
                            auttVar.getClass();
                            return auttVar.name();
                        }
                    };
                    Object objCollect = stream.map(new Function() { // from class: autv
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return fdapVar.invoke(obj2);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.toCollection(new Supplier() { // from class: autw
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return new ArrayList();
                        }
                    }));
                    objCollect.getClass();
                    arrayList.addAll((List) objCollect);
                    Spinner spinnerA = cxwj.a(activity2, arrayList);
                    linearLayout.addView(spinnerA);
                    spinnerA.setSelection(0, false);
                    cxwe cxweVar = new cxwe(cxwjVar, spinnerA);
                    eigp eigpVar = cxwjVar.h;
                    spinnerA.setOnItemSelectedListener(new eigo(eigpVar, cxweVar, "createInitialSyncStatusSpinner", 351));
                    TextView textViewB2 = cyfvVar.b("Pick Encryption status");
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
                    layoutParams2.weight = 1.0f;
                    layoutParams2.gravity = 17;
                    textViewB2.setTypeface(textViewB2.getTypeface(), 1);
                    textViewB2.setLayoutParams(layoutParams2);
                    textViewB2.setPadding(0, 5, 0, 5);
                    linearLayout.addView(textViewB2);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add("Not selected");
                    arrayList2.addAll((Collection) DesugarArrays.stream(aumj.values()).map(new Function() { // from class: cxvr
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return ((aumj) obj2).name();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).map(new Function() { // from class: cxvs
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            ekrg ekrgVar = cxwj.a;
                            return ((String) obj2).substring(18);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.toCollection(new cxvt())));
                    Spinner spinnerA2 = cxwj.a(activity2, arrayList2);
                    linearLayout.addView(spinnerA2);
                    spinnerA2.setSelection(0, false);
                    spinnerA2.setOnItemSelectedListener(new eigo(eigpVar, new cxwg(cxwjVar), "createEncryptionStatusSpinner", 404));
                    cxwjVar.b(cyfvVar, "Set deviceId", linearLayout);
                    cxwjVar.b(cyfvVar, "Set cmsD2DTimestamp", linearLayout);
                    cxwjVar.b(cyfvVar, "Set dailyRetrievedCmsTimestamp", linearLayout);
                    cxwjVar.b(cyfvVar, "Set PriorToCmsGaiaId", linearLayout);
                    cxwjVar.b(cyfvVar, "Set priorToDeviceId", linearLayout);
                    cxwjVar.b(cyfvVar, "Set cmsOptOutTimestamp", linearLayout);
                    builder.create().show();
                    return fctx.a;
                }
            });
        }
        if (cqbe.d()) {
            MenuItem menuItemAdd5 = subMenuAddSubMenu.add("Unmatch Telephony and Bugle");
            menuItemAdd5.getClass();
            c(menuItemAdd5, activity, new fdap() { // from class: cxuv
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ((cyfv) obj).getClass();
                    String[] strArr = MessagesTable.a;
                    brdu brduVar = new brdu();
                    brduVar.ap("unmatchTelephonyAndBugle");
                    brduVar.T();
                    brec brecVar = new brec();
                    brecVar.v(100L);
                    brduVar.W(brecVar);
                    brduVar.b().e();
                    return fctx.a;
                }
            });
            MenuItem menuItemAdd6 = subMenuAddSubMenu.add("Link Account");
            menuItemAdd6.getClass();
            c(menuItemAdd6, activity, new fdap() { // from class: cxuw
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ((cyfv) obj).getClass();
                    cxvq cxvqVar = this.a;
                    auvw.k(cxvqVar.e, null, null, new cxvn(cxvqVar, null), 3);
                    return fctx.a;
                }
            });
            MenuItem menuItemAdd7 = subMenuAddSubMenu.add("Get MDE Account");
            menuItemAdd7.getClass();
            c(menuItemAdd7, activity, new fdap() { // from class: cxux
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ((cyfv) obj).getClass();
                    cxvq cxvqVar = this.a;
                    auvw.k(cxvqVar.e, null, null, new cxvm(cxvqVar, null), 3);
                    return fctx.a;
                }
            });
            cxuo cxuoVar = (cxuo) this.r.a();
            final Intent intentA2 = cxuoVar != null ? cxuoVar.a() : null;
            if (intentA2 != null) {
                MenuItem menuItemAdd8 = subMenuAddSubMenu.add("Alphaverse");
                menuItemAdd8.getClass();
                c(menuItemAdd8, activity, new fdap() { // from class: cxuy
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) throws IOException {
                        ((cyfv) obj).getClass();
                        eiid.o(activity, intentA2);
                        return fctx.a;
                    }
                });
            }
        }
        if (cqbe.c()) {
            MenuItem menuItemAdd9 = subMenuAddSubMenu.add("Simulate batch backup errors");
            menuItemAdd9.getClass();
            c(menuItemAdd9, activity, new fdap() { // from class: cxuz
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ((cyfv) obj).getClass();
                    final cxwj cxwjVar = this.a.b;
                    eiju eijuVarA = cxwjVar.g.a();
                    ejvr ejvrVar = new ejvr() { // from class: cxvw
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            efwo efwoVar = (efwo) obj2;
                            ekrg ekrgVar = cxwj.a;
                            return efwoVar;
                        }
                    };
                    eosc eoscVar = cxwjVar.e;
                    auvh.h(eijuVarA.h(ejvrVar, eoscVar).h(new ejvr() { // from class: cxvx
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            byiu byiuVar = (byiu) byiv.a.createBuilder();
                            int iA = ((efwo) obj2).a();
                            byiuVar.copyOnWrite();
                            byiv byivVar = (byiv) byiuVar.instance;
                            byivVar.b |= 1;
                            byivVar.c = iA;
                            byiuVar.copyOnWrite();
                            byiv byivVar2 = (byiv) byiuVar.instance;
                            byivVar2.b |= 2;
                            byivVar2.d = -999;
                            byiuVar.copyOnWrite();
                            byiv byivVar3 = (byiv) byiuVar.instance;
                            byivVar3.b |= 4;
                            byivVar3.e = "test item id";
                            byiuVar.copyOnWrite();
                            byiv byivVar4 = (byiv) byiuVar.instance;
                            byivVar4.b |= 16;
                            byivVar4.g = true;
                            byiuVar.copyOnWrite();
                            byiv byivVar5 = (byiv) byiuVar.instance;
                            byivVar5.b |= 128;
                            byivVar5.j = "test trigger name";
                            ((cazj) cxwjVar.f.b()).a(cbcu.f("cms_batch_backup", (byiv) byiuVar.build()));
                            return null;
                        }
                    }, eoscVar).e(Exception.class, new ejvr() { // from class: cxvy
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            ekrg ekrgVar = cxwj.a;
                            return null;
                        }
                    }, eoscVar));
                    return fctx.a;
                }
            });
        }
        if (cpyl.a() && ((Boolean) ((cczi) cpyl.t.get()).e()).booleanValue() && cqbe.d() && ((Optional) ((eyig) this.g).a).isPresent()) {
            MenuItem menuItemAdd10 = subMenuAddSubMenu.add("Show Backup Promo Popup");
            menuItemAdd10.getClass();
            c(menuItemAdd10, activity, new fdap() { // from class: cxva
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ((cyfv) obj).getClass();
                    Optional optional = (Optional) ((eyig) this.a.g).a;
                    final fdap fdapVar = new fdap() { // from class: cxvb
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj2) {
                            tms tmsVar = (tms) obj2;
                            tmsVar.getClass();
                            tmsVar.a();
                            return fctx.a;
                        }
                    };
                    optional.ifPresent(new Consumer() { // from class: cxvd
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj2) {
                            fdapVar.invoke(obj2);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    return fctx.a;
                }
            });
        }
        if (cpyl.a() && ((Boolean) ((cczi) cpyl.k.get()).e()).booleanValue() && cqbe.e()) {
            final Intent intentA3 = aiiw.c(activity, KeyRetrievalClientActivity.class, "android.intent.action.VIEW").a();
            intentA3.getClass();
            MenuItem menuItemAdd11 = subMenuAddSubMenu.add("Folsom Tools");
            menuItemAdd11.getClass();
            c(menuItemAdd11, activity, new fdap() { // from class: cxvg
                @Override // defpackage.fdap
                public final Object invoke(Object obj) throws IOException {
                    ((cyfv) obj).getClass();
                    eiid.o(activity, intentA3);
                    return fctx.a;
                }
            });
        }
        if (cqbe.d() && this.o.a() && zJ) {
            final Intent intentA4 = aiiw.c(activity, D2dToolsActivity.class, "android.intent.action.VIEW").a();
            intentA4.getClass();
            MenuItem menuItemAdd12 = subMenuAddSubMenu.add("D2D Tools");
            menuItemAdd12.getClass();
            c(menuItemAdd12, activity, new fdap() { // from class: cxvh
                @Override // defpackage.fdap
                public final Object invoke(Object obj) throws IOException {
                    ((cyfv) obj).getClass();
                    eiid.o(activity, intentA4);
                    return fctx.a;
                }
            });
        }
        if (cpyl.a() && cqbe.d() && zJ) {
            MenuItem menuItemAdd13 = subMenuAddSubMenu.add("Set invalid restore progress");
            menuItemAdd13.getClass();
            c(menuItemAdd13, activity, new fdap() { // from class: cxvi
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ((cyfv) obj).getClass();
                    final aurx aurxVar = this.a.b.c;
                    aurxVar.z(new Function() { // from class: aupe
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            aumg aumgVar = (aumg) obj2;
                            ausj ausjVar = ((aumq) aumgVar.instance).C;
                            if (ausjVar == null) {
                                ausjVar = ausj.a;
                            }
                            aurxVar.al(ausjVar.d, 0L, -1L, "The total messages to restore will be smaller than the restored message count");
                            ausi ausiVar = (ausi) ausjVar.toBuilder();
                            ausiVar.copyOnWrite();
                            ausj ausjVar2 = (ausj) ausiVar.instance;
                            ausjVar2.b |= 1;
                            ausjVar2.c = -1L;
                            aumgVar.copyOnWrite();
                            aumq aumqVar = (aumq) aumgVar.instance;
                            ausj ausjVar3 = (ausj) ausiVar.build();
                            ausjVar3.getClass();
                            aumqVar.C = ausjVar3;
                            aumqVar.b |= 1073741824;
                            return aumgVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return fctx.a;
                }
            });
            MenuItem menuItemAdd14 = subMenuAddSubMenu.add("Set invalid backup progress");
            menuItemAdd14.getClass();
            c(menuItemAdd14, activity, new fdap() { // from class: cxvj
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ((cyfv) obj).getClass();
                    final cxwj cxwjVar = this.a.b;
                    eijx.f(new Runnable() { // from class: cxvv
                        @Override // java.lang.Runnable
                        public final void run() {
                            cxwjVar.c.aa(-1L);
                        }
                    }, cxwjVar.d);
                    return fctx.a;
                }
            });
        }
        if (cqbe.e()) {
            Optional optional = (Optional) ((eyig) this.h).a;
            if (!optional.isPresent() || ((cybn) optional.get()).a()) {
                return;
            }
            MenuItem menuItemAdd15 = subMenuAddSubMenu.add("Dump debug db");
            menuItemAdd15.getClass();
            c(menuItemAdd15, activity, new fdap() { // from class: cxvk
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ((cyfv) obj).getClass();
                    ((cybn) ((Optional) ((eyig) this.a.h).a).get()).b();
                    return fctx.a;
                }
            });
            MenuItem menuItemAdd16 = subMenuAddSubMenu.add("Dump metadata");
            menuItemAdd16.getClass();
            c(menuItemAdd16, activity, new fdap() { // from class: cxvl
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ((cyfv) obj).getClass();
                    ((cybn) ((Optional) ((eyig) this.a.h).a).get()).b();
                    return fctx.a;
                }
            });
        }
    }

    public final cmfo b() {
        return (cmfo) this.q.a();
    }
}
