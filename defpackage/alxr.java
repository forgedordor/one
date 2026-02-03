package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.util.DesugarDate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/* compiled from: PG */
@fcsv
/* loaded from: classes6.dex */
public final class alxr implements amfb {
    public final Context a;
    public final cqjy b;
    public final bael c;
    public final cmqj d;
    public final bfsa e;
    public final baxl f;
    public final crny g;
    public final fcsu h;
    public final cseb i;
    public final aptx j;
    public final aqmq k;
    public final fcsu l;
    public final String m;
    private final fdjx n;

    public alxr(Context context, fdjx fdjxVar, cqjy cqjyVar, bael baelVar, cmqj cmqjVar, bfsa bfsaVar, baxl baxlVar, crny crnyVar, fcsu fcsuVar, cseb csebVar, aptx aptxVar, aqmq aqmqVar, fcsu fcsuVar2) {
        context.getClass();
        fdjxVar.getClass();
        cqjyVar.getClass();
        baelVar.getClass();
        cmqjVar.getClass();
        bfsaVar.getClass();
        baxlVar.getClass();
        crnyVar.getClass();
        fcsuVar.getClass();
        aptxVar.getClass();
        aqmqVar.getClass();
        fcsuVar2.getClass();
        this.a = context;
        this.n = fdjxVar;
        this.b = cqjyVar;
        this.c = baelVar;
        this.d = cmqjVar;
        this.e = bfsaVar;
        this.f = baxlVar;
        this.g = crnyVar;
        this.h = fcsuVar;
        this.i = csebVar;
        this.j = aptxVar;
        this.k = aqmqVar;
        this.l = fcsuVar2;
        String string = context.getString(R.string.unknown);
        string.getClass();
        this.m = string;
    }

    public static final MessageIdType d(MessageId messageId) {
        if (!(messageId instanceof amgc)) {
            throw new IllegalStateException("Unsupported message id type.");
        }
        MessageIdType messageIdTypeC = ((amgc) messageId).c();
        messageIdTypeC.getClass();
        return messageIdTypeC;
    }

    public static final String e(alwv alwvVar, boolean z) {
        ekgb ekgbVar = alwvVar.e;
        if (ekgbVar.size() == 1) {
            if (!z) {
                return ((ResolvedRecipient) ekgbVar.get(0)).g().G(true).toString();
            }
            String strN = ((ResolvedRecipient) ekgbVar.get(0)).g().n();
            return strN != null ? strN : ((ResolvedRecipient) ekgbVar.get(0)).g().G(true).toString();
        }
        StringBuilder sb = new StringBuilder("[");
        ekqh it = ekgbVar.iterator();
        it.getClass();
        while (it.hasNext()) {
            ResolvedRecipient resolvedRecipient = (ResolvedRecipient) it.next();
            sb.append(" ");
            if (z) {
                sb.append(resolvedRecipient.g().n());
            } else {
                sb.append(resolvedRecipient.g().G(true));
            }
        }
        sb.append(" ]");
        return sb.toString();
    }

    @Override // defpackage.amfb
    public final eiju a(ajlt ajltVar) {
        return auvw.c(this.n, fcyi.a, fdjz.a, new alxp(this, ajltVar, null));
    }

    public final ekgb b(ekgp ekgpVar, long[] jArr, long[] jArr2) {
        if (jArr2 == null) {
            int i = ekgb.d;
            ekgb ekgbVar = ekoe.a;
            ekgbVar.getClass();
            return ekgbVar;
        }
        ArrayList arrayList = new ArrayList(jArr2.length);
        int i2 = 0;
        int i3 = 0;
        while (i2 < jArr2.length) {
            long j = jArr2[i2];
            int i4 = i3 + 1;
            ResolvedRecipient resolvedRecipient = (ResolvedRecipient) ekgpVar.get(Long.valueOf(jArr[i3]));
            alxo alxoVar = null;
            if (resolvedRecipient != null && j > 0) {
                Instant instantOfEpochMilli = Instant.ofEpochMilli(j);
                instantOfEpochMilli.getClass();
                alxoVar = new alxo(this, resolvedRecipient, instantOfEpochMilli);
            }
            arrayList.add(alxoVar);
            i2++;
            i3 = i4;
        }
        return ekfv.a(fcva.al(fcva.ae(arrayList), new alxq()));
    }

    public final String c(Instant instant) {
        String str = new SimpleDateFormat("MM/d/yy h:mm a", craf.c(this.a)).format(DesugarDate.from(instant.atZone(ZoneId.systemDefault()).toLocalDateTime().y(ZoneId.systemDefault()).truncatedTo(ChronoUnit.MINUTES).toInstant()));
        str.getClass();
        return str;
    }
}
