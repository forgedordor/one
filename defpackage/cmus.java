package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmus {
    private final Context a;
    private final fcsu b;
    private final fcsu c;

    public cmus(Context context, fcsu fcsuVar, fcsu fcsuVar2) {
        context.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.a = context;
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    public final Bundle a(int i, int i2) throws Exception {
        int[] iArrA = ((cqjz) this.c.b()).a(i);
        int i3 = 0;
        int i4 = iArrA[0];
        int i5 = iArrA[1];
        Configuration configuration = new Configuration();
        Context context = this.a;
        try {
            try {
                if (i4 == 0) {
                    if (i5 == 0) {
                        Configuration configuration2 = context.getResources().getConfiguration();
                        configuration.mcc = configuration2.mcc;
                        configuration.mnc = configuration2.mnc;
                    }
                    Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
                    contextCreateConfigurationContext.getClass();
                    XmlResourceParser xml = contextCreateConfigurationContext.getResources().getXml(i2);
                    Bundle bundle = new Bundle();
                    crmx crmxVar = (crmx) this.b.b();
                    int i6 = cmts.a;
                    cqaz.l(xml);
                    cmts.a(crmxVar, new StringBuilder(), xml, new cmur(bundle));
                    fdaa.a(xml, null);
                    return bundle;
                }
                i3 = i4;
                crmx crmxVar2 = (crmx) this.b.b();
                int i62 = cmts.a;
                cqaz.l(xml);
                cmts.a(crmxVar2, new StringBuilder(), xml, new cmur(bundle));
                fdaa.a(xml, null);
                return bundle;
            } finally {
            }
            XmlResourceParser xml2 = contextCreateConfigurationContext.getResources().getXml(i2);
            Bundle bundle2 = new Bundle();
        } catch (Resources.NotFoundException e) {
            ekrd ekrdVar = (ekrd) ((ekrd) ekrg.c("com/google/android/apps/messaging/shared/sms/config/ResourceCarrierConfigLoader").j()).g(e);
            ekrdVar.X(eksq.a, "Bugle");
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/sms/config/ResourceCarrierConfigLoader", "loadFromResources", 45, "ResourceCarrierConfigLoader.kt")).q("Cannot find mms_config.xml:");
            return new Bundle();
        }
        configuration.mcc = i3;
        configuration.mnc = i5;
        Context contextCreateConfigurationContext2 = context.createConfigurationContext(configuration);
        contextCreateConfigurationContext2.getClass();
    }
}
