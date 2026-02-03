package defpackage;

import android.text.TextWatcher;
import android.view.View;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface dngc {
    View.OnClickListener a(String str, View.OnClickListener onClickListener);

    View.OnLongClickListener b(String str, View.OnLongClickListener onLongClickListener);

    Object c(String str, fdap fdapVar, fcxy fcxyVar);

    Object d(String str, fdae fdaeVar);

    Object e(String str, fdap fdapVar, fcxy fcxyVar);

    Object f(String str, fdae fdaeVar);

    fcyh g(ScheduledExecutorService scheduledExecutorService);

    TextWatcher h(TextWatcher textWatcher);
}
