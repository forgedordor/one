package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import j$.time.TimeConversions;
import j$.time.ZonedDateTime;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eujn extends eukg {
    public static final /* synthetic */ int b = 0;
    public final TextClassifier a;
    private final Context c;

    public eujn(Context context, TextClassifier textClassifier) {
        this.c = context;
        textClassifier.getClass();
        this.a = textClassifier;
        if (eujh.b == null) {
            int i = eujg.a;
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            Object systemService = applicationContext.getSystemService("user");
            Bundle userRestrictions = systemService instanceof UserManager ? ((UserManager) systemService).getUserRestrictions() : new Bundle();
            applicationContext.getClass();
            packageManager.getClass();
            userRestrictions.getClass();
            eujh.b = new eujh();
        }
    }

    @Override // defpackage.eukg
    public final eukb a(euka eukaVar) {
        c();
        return Build.VERSION.SDK_INT >= 28 ? eukb.b(this.c, this.a.classifyText(new TextClassification.Request.Builder(eukaVar.a, eukaVar.b, eukaVar.c).setDefaultLocales(euii.a(eukaVar.d)).setReferenceTime(TimeConversions.convert((ZonedDateTime) null)).build())) : eukb.b(this.c, this.a.classifyText(eukaVar.a, eukaVar.b, eukaVar.c, euii.a(eukaVar.d)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c6  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.os.Bundle, android.text.util.Linkify$MatchFilter] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    @Override // defpackage.eukg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eult b(defpackage.eulp r17) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eujn.b(eulp):eult");
    }
}
