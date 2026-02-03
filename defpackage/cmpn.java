package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.rcs.client.messaging.data.BasicTextMessage;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class cmpn {
    private final eosc a;
    public final efob m;
    public final atak n;

    protected cmpn(efob efobVar, atak atakVar, eosc eoscVar) {
        this.m = efobVar;
        this.n = atakVar;
        this.a = eoscVar;
    }

    public eiju d(MessageCoreData messageCoreData, asrg asrgVar) {
        return e(cmpj.a(messageCoreData), asrgVar);
    }

    public eiju e(final cmpk cmpkVar, asrg asrgVar) {
        return eijx.g(new Callable() { // from class: cmpm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                efhf efhfVar = new efhf();
                efhfVar.b(cmpkVar.b);
                BasicTextMessage basicTextMessageA = efhfVar.a();
                cmpn cmpnVar = this.a;
                try {
                    return (aubt) cmpnVar.n.fM(cmpnVar.m.b(BasicTextMessage.class).b(basicTextMessageA));
                } catch (efoc e) {
                    throw new cmph(e);
                }
            }
        }, this.a);
    }
}
