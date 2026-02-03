package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class einm {
    public final eigp a;
    public View b;

    public einm(eigp eigpVar) {
        this.a = eigpVar;
    }

    public static final String c(String str, View view) {
        String simpleName = (String) view.getTag(R.id.tiktok_event_internal_trace);
        if (simpleName == null) {
            simpleName = view.getClass().getSimpleName();
        }
        return a.q(simpleName, str, " ");
    }

    public static final void d(View view, String str) {
        view.setTag(R.id.tiktok_event_internal_trace, str);
    }

    @Deprecated
    public final void a(View view, final View.OnClickListener onClickListener) {
        final ejvr ejvrVar = new ejvr() { // from class: eing
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return eiey.a;
            }
        };
        view.setOnClickListener(new View.OnClickListener() { // from class: einl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                View.OnClickListener onClickListener2 = onClickListener;
                if (!eidq.a(view2)) {
                    return;
                }
                ejvr ejvrVar2 = ejvrVar;
                einm einmVar = this.a;
                eieh eiehVarF = einmVar.a.f("com/google/apps/tiktok/ui/event/Events", "onClick", 108, einm.c("Clicked", view2), (eiez) ejvrVar2.apply(view2));
                try {
                    onClickListener2.onClick(view2);
                    eiehVarF.close();
                } finally {
                }
            }
        });
    }

    public final void b(View view, final einb einbVar) {
        a(view, new View.OnClickListener() { // from class: eini
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                einf.g(einbVar, view2);
            }
        });
    }
}
