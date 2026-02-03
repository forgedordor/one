package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.simpicker.SimPickerView;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uuc {
    public final SimPickerView a;
    public LinearLayout b;
    public final RecyclerView c;

    public uuc(Optional optional, utw utwVar, SimPickerView simPickerView) {
        Optional.empty();
        this.a = simPickerView;
        RecyclerView recyclerView = (RecyclerView) simPickerView.findViewById(R.id.sim_list);
        this.c = recyclerView;
        simPickerView.getContext();
        recyclerView.ao(new LinearLayoutManager());
        recyclerView.al(utwVar);
        if (clpp.a()) {
            this.b = (LinearLayout) simPickerView.findViewById(R.id.send_option_layout);
            final cpdw cpdwVar = new cpdw(simPickerView, R.id.scheduled_send_entry_point, R.id.scheduled_send_entry_point);
            optional.map(new Function() { // from class: uub
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ((einm) ((aihw) obj).a.b()).getClass();
                    return new aihx(cpdwVar);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
        if (!clpp.a()) {
            simPickerView.clearAnimation();
            recyclerView.clearAnimation();
            cqei.a(simPickerView.getContext());
            simPickerView.setAlpha(0.0f);
            recyclerView.setTranslationY(recyclerView.getHeight());
            simPickerView.setVisibility(8);
            return;
        }
        this.b.getClass();
        simPickerView.clearAnimation();
        this.b.clearAnimation();
        cqei.a(simPickerView.getContext());
        simPickerView.setAlpha(0.0f);
        this.b.setTranslationY(r3.getHeight());
        simPickerView.setVisibility(8);
    }
}
