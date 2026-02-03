package defpackage;

import com.google.android.rcs.client.messaging.data.GroupEvent;
import com.google.android.rcs.client.messaging.data.GroupMember;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efpx extends efou {
    private final efqd a;

    public efpx(efqd efqdVar) {
        this.a = efqdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.efou
    public final void b(GroupEvent groupEvent, cjhr cjhrVar) {
        ekgb ekgbVarA = groupEvent.a();
        int size = ekgbVarA.size();
        for (int i = 0; i < size; i++) {
            cjhy cjhyVar = (cjhy) this.a.fH().fM((GroupMember) ekgbVarA.get(i));
            cjhrVar.copyOnWrite();
            cjhs cjhsVar = (cjhs) cjhrVar.instance;
            cjhs cjhsVar2 = cjhs.a;
            cjhyVar.getClass();
            evtg evtgVar = cjhsVar.b;
            if (!evtgVar.c()) {
                cjhsVar.b = evsn.mutableCopy(evtgVar);
            }
            cjhsVar.b.add(cjhyVar);
        }
    }
}
