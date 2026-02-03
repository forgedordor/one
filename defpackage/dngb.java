package defpackage;

import android.text.TextWatcher;
import android.view.View;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dngb implements dngc {
    @Override // defpackage.dngc
    public final Object c(String str, fdap fdapVar, fcxy fcxyVar) {
        return fdapVar.invoke(fcxyVar);
    }

    @Override // defpackage.dngc
    public final Object d(String str, fdae fdaeVar) {
        return fdaeVar.invoke();
    }

    @Override // defpackage.dngc
    public final Object e(String str, fdap fdapVar, fcxy fcxyVar) {
        return fdapVar.invoke(fcxyVar);
    }

    @Override // defpackage.dngc
    public final Object f(String str, fdae fdaeVar) {
        return fdaeVar.invoke();
    }

    @Override // defpackage.dngc
    public final /* synthetic */ fcyh g(ScheduledExecutorService scheduledExecutorService) {
        return new fdlh(scheduledExecutorService);
    }

    @Override // defpackage.dngc
    public final TextWatcher h(TextWatcher textWatcher) {
        return textWatcher;
    }

    @Override // defpackage.dngc
    public final View.OnClickListener a(String str, View.OnClickListener onClickListener) {
        return onClickListener;
    }

    @Override // defpackage.dngc
    public final View.OnLongClickListener b(String str, View.OnLongClickListener onLongClickListener) {
        return onLongClickListener;
    }
}
