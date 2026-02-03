package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.erzj;
import defpackage.erzx;
import defpackage.esbz;
import defpackage.esca;
import defpackage.escf;
import defpackage.escr;
import defpackage.esde;
import defpackage.esfo;
import defpackage.esfp;
import defpackage.esfr;
import defpackage.esft;
import defpackage.esle;
import defpackage.eslg;
import defpackage.eslh;
import defpackage.esli;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<esca<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        esbz esbzVarB = esca.b(esli.class);
        esbzVarB.b(new escr(esle.class, 2, 0));
        esbzVarB.c = new escf() { // from class: eslb
            @Override // defpackage.escf
            public final Object a(escc esccVar) {
                Set setD = escb.d(esccVar, esle.class);
                esld esldVar = esld.a;
                if (esldVar == null) {
                    synchronized (esld.class) {
                        esldVar = esld.a;
                        if (esldVar == null) {
                            esldVar = new esld();
                            esld.a = esldVar;
                        }
                    }
                }
                return new eslc(setD, esldVar);
            }
        };
        arrayList.add(esbzVarB.a());
        final esde esdeVar = new esde(erzx.class, Executor.class);
        esbz esbzVar = new esbz(esfo.class, esfr.class, esft.class);
        esbzVar.b(new escr(Context.class, 1, 0));
        esbzVar.b(new escr(erzj.class, 1, 0));
        esbzVar.b(new escr(esfp.class, 2, 0));
        esbzVar.b(new escr(esli.class, 1, 1));
        esbzVar.b(new escr(esdeVar, 1, 0));
        esbzVar.c = new escf() { // from class: esfm
            @Override // defpackage.escf
            public final Object a(escc esccVar) {
                return new esfo((Context) esccVar.e(Context.class), ((erzj) esccVar.e(erzj.class)).h(), escb.d(esccVar, esfp.class), esccVar.b(esli.class), (Executor) esccVar.d(esdeVar));
            }
        };
        arrayList.add(esbzVar.a());
        arrayList.add(eslh.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(eslh.a("fire-core", "21.0.0_1p"));
        arrayList.add(eslh.a("device-name", a(Build.PRODUCT)));
        arrayList.add(eslh.a("device-model", a(Build.DEVICE)));
        arrayList.add(eslh.a("device-brand", a(Build.BRAND)));
        arrayList.add(eslh.b("android-target-sdk", new eslg() { // from class: erzo
            @Override // defpackage.eslg
            public final String a(Object obj) {
                ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
            }
        }));
        arrayList.add(eslh.b("android-min-sdk", new eslg() { // from class: erzp
            @Override // defpackage.eslg
            public final String a(Object obj) {
                ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
            }
        }));
        arrayList.add(eslh.b("android-platform", new eslg() { // from class: erzq
            @Override // defpackage.eslg
            public final String a(Object obj) {
                Context context = (Context) obj;
                return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
            }
        }));
        arrayList.add(eslh.b("android-installer", new eslg() { // from class: erzr
            @Override // defpackage.eslg
            public final String a(Object obj) {
                Context context = (Context) obj;
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
            }
        }));
        return arrayList;
    }
}
