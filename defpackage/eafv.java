package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eafv {
    public final String a;
    final ejxr b;
    final ejxr c;
    Resources d;
    public final /* synthetic */ eafw e;

    public eafv(final eafw eafwVar, final String str, ejxr ejxrVar) {
        this.e = eafwVar;
        this.a = str;
        this.b = new eafr(new ejxr() { // from class: eafs
            @Override // defpackage.ejxr
            public final Object get() throws Resources.NotFoundException, IOException {
                erxh erxhVar;
                eafv eafvVar = this.a;
                eafw eafwVar2 = eafwVar;
                String str2 = str;
                try {
                    PackageManager packageManager = eafwVar2.a;
                    erxh erxhVar2 = erxi.a;
                    if (str2 == null) {
                        throw null;
                    }
                    Intent intent = new Intent("com.google.android.build.data.Properties");
                    intent.setPackage(str2);
                    List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 787072);
                    if (listQueryIntentServices.isEmpty()) {
                        erxhVar = erxi.a;
                    } else {
                        if (listQueryIntentServices.size() > 1) {
                            throw new IOException("Failed to resolve target AndroidBuildData");
                        }
                        int i = listQueryIntentServices.get(0).serviceInfo.metaData.getInt("com.google.android.build.data.properties");
                        if (i == 0) {
                            erxhVar = erxi.a;
                        } else {
                            try {
                                InputStream inputStreamOpenRawResource = eafvVar.a().openRawResource(i);
                                evrr evrrVar = evrr.a;
                                evuq evuqVar = evuq.a;
                                erxhVar = (erxh) evsn.parseFrom(erxh.a, inputStreamOpenRawResource, evrr.a);
                            } catch (PackageManager.NameNotFoundException unused) {
                                erxhVar = erxi.a;
                            }
                        }
                    }
                    return Long.valueOf(erxhVar.b);
                } catch (IOException e) {
                    Log.e("PhenotypeResourceReader", "Failed to read baseline CL for package ".concat(String.valueOf(str2)), e);
                    return -1L;
                }
            }
        });
        this.c = ejxrVar;
    }

    public final Resources a() throws PackageManager.NameNotFoundException {
        Resources resources = this.d;
        if (resources != null) {
            return resources;
        }
        eafw eafwVar = this.e;
        Resources resourcesForApplication = eafwVar.a.getResourcesForApplication(this.a);
        this.d = resourcesForApplication;
        return resourcesForApplication;
    }
}
