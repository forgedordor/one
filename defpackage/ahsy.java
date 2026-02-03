package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.reportissue.ReportIssueReceiver;
import com.google.protobuf.contrib.android.ProtoParsers;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahsy implements clgq {
    private static final cqce a = cqce.g("Bugle", "ReportIssueIntentsImpl");
    private final Context b;
    private final fcsu c;
    private final fcsu d;

    public ahsy(Context context, fcsu fcsuVar, fcsu fcsuVar2) {
        this.b = context;
        this.c = fcsuVar;
        this.d = fcsuVar2;
    }

    private static acie g(emgm emgmVar, Throwable th, ekgp ekgpVar) {
        acik acikVar = new acik();
        acikVar.a = Optional.ofNullable(th);
        acikVar.b = Optional.ofNullable(ekgpVar);
        acikVar.b(elie.BUGLE_ADVANCED_FEEDBACK_SOURCE_NOTIFICATION_GENERIC);
        acikVar.c = Optional.of(emgmVar);
        return acikVar.a();
    }

    private static boolean h(emgm emgmVar) {
        return ((Boolean) ackx.a.e()).booleanValue() && !emgmVar.equals(emgm.SILENT_CRASH);
    }

    private final PendingIntent i(String str, int i, emgm emgmVar, Throwable th, ekgp ekgpVar) {
        if (h(emgmVar) && ((Boolean) ackx.d.e()).booleanValue()) {
            acif acifVar = (acif) this.d.b();
            Context context = this.b;
            Intent intentA = acifVar.a(context, g(emgmVar, th, ekgpVar));
            intentA.setAction(str);
            ProtoParsers.i(intentA, "report_issue_event_type", (emgo) j(i, emgmVar).build());
            return PendingIntent.getActivity(context, 0, intentA, 201326592);
        }
        Context context2 = this.b;
        aiiw aiiwVarC = aiiw.c(context2, ReportIssueReceiver.class, "android.intent.action.VIEW");
        aiiwVarC.f(context2.getPackageName());
        aiiwVarC.e(str);
        Intent intentA2 = aiiwVarC.a();
        if (th != null) {
            intentA2.putExtra("throwable", th);
        }
        if (ekgpVar != null) {
            final Bundle bundle = new Bundle();
            Map.EL.forEach(ekgpVar, new BiConsumer() { // from class: ahsx
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    bundle.putString((String) obj, (String) obj2);
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            });
            intentA2.putExtra("psd_map", bundle);
        }
        ProtoParsers.i(intentA2, "report_issue_event_type", (emgo) j(i, emgmVar).build());
        return PendingIntent.getBroadcast(context2, 0, intentA2, 201326592);
    }

    private static emgj j(int i, emgm emgmVar) {
        emgj emgjVar = (emgj) emgo.a.createBuilder();
        emgjVar.copyOnWrite();
        emgo emgoVar = (emgo) emgjVar.instance;
        emgoVar.c = 2;
        emgoVar.b |= 1;
        emgjVar.copyOnWrite();
        emgo emgoVar2 = (emgo) emgjVar.instance;
        emgoVar2.e = i - 1;
        emgoVar2.b |= 4;
        emgjVar.copyOnWrite();
        emgo emgoVar3 = (emgo) emgjVar.instance;
        emgoVar3.d = emgmVar.o;
        emgoVar3.b |= 2;
        return emgjVar;
    }

    @Override // defpackage.clgq
    public final PendingIntent a(emgm emgmVar) {
        Context context = this.b;
        aiiw aiiwVarC = aiiw.c(context, ReportIssueReceiver.class, "android.intent.action.VIEW");
        aiiwVarC.f(context.getPackageName());
        Intent intentA = aiiwVarC.a();
        intentA.setAction("com.google.android.apps.messaging.shared.reportissue.DISMISS_NOTIFICATION");
        emgj emgjVar = (emgj) emgo.a.createBuilder();
        emgjVar.copyOnWrite();
        emgo emgoVar = (emgo) emgjVar.instance;
        emgoVar.c = 4;
        emgoVar.b |= 1;
        emgjVar.copyOnWrite();
        emgo emgoVar2 = (emgo) emgjVar.instance;
        emgoVar2.d = emgmVar.o;
        emgoVar2.b |= 2;
        ProtoParsers.i(intentA, "report_issue_event_type", (emgo) emgjVar.build());
        return PendingIntent.getBroadcast(context, 0, intentA, 201326592);
    }

    @Override // defpackage.clgq
    public final PendingIntent b(cgdx cgdxVar) {
        emgm emgmVar;
        Object obj;
        cgav cgavVar = (cgav) cgdxVar;
        Optional optional = cgavVar.c;
        boolean zIsPresent = optional.isPresent();
        emgm emgmVar2 = cgavVar.a;
        if (zIsPresent) {
            Object obj2 = optional.get();
            if (emgmVar2 == emgm.UNKNOWN_ISSUE_TYPE) {
                emgmVar2 = emgm.SILENT_CRASH;
            }
            emgmVar = emgmVar2;
            obj = obj2;
        } else {
            emgmVar = emgmVar2;
            obj = null;
        }
        Optional optional2 = cgavVar.d;
        return i("com.google.android.apps.messaging.shared.reportissue.LAUNCH_FEEDBACK_FROM_NOTIFICATION", 2, emgmVar, (Throwable) obj, (ekgp) (optional2.isPresent() ? optional2.get() : null));
    }

    @Override // defpackage.clgq
    public final PendingIntent c(emgm emgmVar, ekgp ekgpVar) {
        return i("com.google.android.apps.messaging.shared.reportissue.LAUNCH_FEEDBACK_FROM_NOTIFICATION", 2, emgmVar, null, ekgpVar);
    }

    @Override // defpackage.clgq
    public final PendingIntent d(emgm emgmVar) {
        return i("com.google.android.apps.messaging.shared.reportissue.LAUNCH_FEEDBACK_FROM_NOTIFICATION_ACTION", 3, emgmVar, null, null);
    }

    @Override // defpackage.clgq
    public final eiju e(emgm emgmVar, Throwable th, ekgp ekgpVar) {
        if (!h(emgmVar)) {
            return eiju.g(((acnq) this.c.b()).a(emgmVar, th, ekgpVar));
        }
        ejwl.l(!((Boolean) ackx.d.e()).booleanValue());
        ((acif) this.d.b()).b(this.b, g(emgmVar, th, ekgpVar));
        return eijx.e(null);
    }

    @Override // defpackage.clgq
    public final emgo f(Intent intent, String str, int i) {
        try {
            return (emgo) ProtoParsers.c(intent, str, emgo.a, evrr.a());
        } catch (evtj e) {
            a.s("Failed to parse ReportIssueEvent", e);
            emgj emgjVar = (emgj) emgo.a.createBuilder();
            emgjVar.copyOnWrite();
            emgo emgoVar = (emgo) emgjVar.instance;
            emgoVar.c = i - 1;
            emgoVar.b |= 1;
            return (emgo) emgjVar.build();
        }
    }
}
