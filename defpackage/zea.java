package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import com.google.android.apps.messaging.R;
import j$.time.ZoneId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zea {
    private final cqjk a;
    private final Optional b;

    public zea(cqjk cqjkVar, Optional optional) {
        cqjkVar.getClass();
        this.a = cqjkVar;
        this.b = optional;
    }

    public static final dkol a(dkod dkodVar, dkoc dkocVar, dkob dkobVar, boolean z) {
        return new dkol(dkodVar, dkocVar, dkobVar, !z, new dkok((byte[]) null));
    }

    static /* synthetic */ dkol c(dkod dkodVar, dkoc dkocVar, boolean z, int i) {
        if (1 == (i & 1)) {
            dkodVar = null;
        }
        if ((i & 2) != 0) {
            dkocVar = null;
        }
        return a(dkodVar, dkocVar, null, z);
    }

    public final auyl b(ymx ymxVar, boolean z, final boolean z2) throws Resources.NotFoundException {
        final dkod dkodVar;
        ygl yglVar;
        CharSequence string;
        if (ymxVar.h()) {
            cqjk cqjkVar = this.a;
            long epochMilli = ymxVar.a().o().toEpochMilli();
            cqjj cqjjVar = cqjkVar.a;
            cogw cogwVar = cqjjVar.b;
            Context context = cqjjVar.a;
            boolean zIs24HourFormat = DateFormat.is24HourFormat(context);
            long epochMilli2 = cogwVar.f().toEpochMilli();
            long j = epochMilli2 - epochMilli;
            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
            zoneIdSystemDefault.getClass();
            long jA = cqjl.a(epochMilli, epochMilli2, zoneIdSystemDefault);
            int i = true != zIs24HourFormat ? 64 : 128;
            if (jA == 0) {
                string = cqjl.d(context, epochMilli, i);
            } else if (jA == 1) {
                String string2 = context.getResources().getString(R.string.message_metadata_separator);
                string2.getClass();
                string = context.getResources().getString(R.string.posted_yesterday, string2, cqjl.d(context, epochMilli, i));
                string.getClass();
            } else if (j < 604800000) {
                Resources resources = context.getResources();
                resources.getClass();
                String dateTime = DateUtils.formatDateTime(context, epochMilli, 2);
                String string3 = resources.getString(R.string.message_metadata_separator);
                string3.getClass();
                string = resources.getString(R.string.posted_this_week, dateTime, string3, cqjl.d(context, epochMilli, i));
                string.getClass();
            } else if (j < 31449600000L) {
                Resources resources2 = context.getResources();
                resources2.getClass();
                String dateTime2 = DateUtils.formatDateTime(context, epochMilli, 65562 | i);
                String string4 = resources2.getString(R.string.message_metadata_separator);
                string4.getClass();
                string = resources2.getString(R.string.posted_this_year, dateTime2, string4, cqjl.d(context, epochMilli, i));
                string.getClass();
            } else {
                String string5 = context.getResources().getString(R.string.message_metadata_separator);
                string5.getClass();
                string = context.getResources().getString(R.string.posted_over_a_year, DateUtils.formatDateTime(context, epochMilli, 65558 | i), string5, cqjl.d(context, epochMilli, i));
                string.getClass();
            }
            dkodVar = new dkod((String) string);
        } else {
            dkodVar = null;
        }
        if (!z) {
            return new auxq(new fdae() { // from class: zdt
                @Override // defpackage.fdae
                public final Object invoke() {
                    return zea.c(dkodVar, null, z2, 6);
                }
            });
        }
        ymxVar.a().b();
        dkoc dkocVar = new dkoc(aadl.a);
        fdpl zdwVar = (((Boolean) vcv.e.e()).booleanValue() && (yglVar = (ygl) fdct.b(this.b)) != null) ? new zdw(yglVar.a()) : fdpk.a;
        return auyp.b(new zdz(zdwVar, dkodVar, dkocVar, z2), c(dkodVar, dkocVar, z2, 4));
    }
}
