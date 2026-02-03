package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxsp {
    public static final long a = TimeUnit.SECONDS.toMillis(10);
    public final bveg b;
    public final bahv c;
    public final ceag d;
    public final eygg e;
    public final cogw f;
    public final cmot g;
    public final Context h;
    public final fcsu i;
    public final fcsu j;
    public final dakl k;
    public final Optional l;
    public final apsl m;
    public final fcsu n;

    public cxsp(bveg bvegVar, bahv bahvVar, ceag ceagVar, eygg eyggVar, cogw cogwVar, cmot cmotVar, Context context, fcsu fcsuVar, fcsu fcsuVar2, dakl daklVar, Optional optional, apsl apslVar, fcsu fcsuVar3) {
        this.b = bvegVar;
        this.c = bahvVar;
        this.d = ceagVar;
        this.e = eyggVar;
        this.f = cogwVar;
        this.g = cmotVar;
        this.h = context;
        this.i = fcsuVar;
        this.j = fcsuVar2;
        this.k = daklVar;
        this.l = optional;
        this.m = apslVar;
        this.n = fcsuVar3;
    }

    public static ContentValues a(String str, String str2, long j, long j2, long j3, boolean z, boolean z2, boolean z3) {
        ContentValues contentValues = new ContentValues(9);
        contentValues.put("address", str);
        contentValues.put("body", str2);
        Long lValueOf = Long.valueOf(j);
        contentValues.put("date_sent", lValueOf);
        contentValues.put("date", lValueOf);
        contentValues.put("read", Boolean.valueOf(z3));
        contentValues.put("seen", Boolean.valueOf(z2));
        contentValues.put("protocol", (Integer) 0);
        contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, Integer.valueOf(true == z ? 2 : 1));
        if (j3 != -1) {
            contentValues.put("person", Long.valueOf(j3));
        }
        contentValues.put("sub_id", (Integer) (-1));
        contentValues.put("thread_id", Long.valueOf(j2));
        return contentValues;
    }

    public static Uri b(Context context, int i) {
        Resources resources = context.getResources();
        return new Uri.Builder().scheme("android.resource").authority(resources.getResourcePackageName(i)).appendPath(resources.getResourceTypeName(i)).appendPath(resources.getResourceEntryName(i)).build();
    }

    public final MessagePartCoreData c(Uri uri, String str, String str2) {
        bahx bahxVarD = bahy.D();
        bacm bacmVar = (bacm) bahxVarD;
        bacmVar.b = str;
        bacmVar.c = str2;
        bacmVar.d = uri;
        bacmVar.e = uri;
        bahxVarD.n(elha.NOT_AVAILABLE);
        return this.c.c(bahxVarD.q());
    }

    public final cqdj d(Context context, int i, String str, int i2, TextView textView, ProgressBar progressBar, String str2, long j, int i3, long j2, cmot cmotVar, Context context2) {
        int i4 = i * i2;
        cxsn cxsnVar = new cxsn(this, progressBar, i4, textView, i, str, cmotVar, new HashMap(), i2, new Random(), j - (a * i4), str2, new String[]{"alpha", "bravo", "charlie", "delta", "echo", "foxtrot", "golf", "hotel", "indigo", "juliet", "kilo", "lima", "mike", "november", "oscar", "papa", "quebec", "romeo", "sierra", "tango", "uniform", "victor", "whiskey", "x-ray", "yankee", "zulu"}, j2, context, context2, i3);
        cxsnVar.e(new Void[0]);
        return cxsnVar;
    }
}
