package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uez extends vo {
    public ekgb a;
    private final Map d;
    private final eigp e;
    private final ekgp f;

    public uez(Map map, eigp eigpVar, ekgp ekgpVar) {
        this.d = map;
        this.e = eigpVar;
        this.f = ekgpVar;
    }

    @Override // defpackage.vo
    public final int a() {
        ekgb ekgbVar = this.a;
        if (ekgbVar == null) {
            return 0;
        }
        return ekgbVar.size();
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        ekgb ekgbVar = this.a;
        ekgbVar.getClass();
        ejwl.a(i < ekgbVar.size());
        return ((uek) this.a.get(i)).a().g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vo
    public final wv e(ViewGroup viewGroup, int i) {
        final uer uerVar;
        uer uerVar2 = uer.REACTION_BADGE;
        if (i == 0) {
            uerVar = uer.REACTION_BADGE;
        } else if (i == 1) {
            uerVar = uer.CUSTOM_REACTION_BADGE;
        } else if (i == 2) {
            uerVar = uer.STAR_BADGE;
        } else if (i == 3) {
            uerVar = uer.CALENDAR_BADGE;
        } else if (i == 4) {
            uerVar = uer.SCHEDULED_SEND_BADGE;
        } else {
            if (i != 5) {
                throw new IllegalArgumentException("No BadgeViewType corresponding to value " + i);
            }
            uerVar = uer.REMINDER_BADGE;
        }
        Map map = this.d;
        ejwl.a(map.containsKey(uerVar));
        uep uepVar = (uep) map.get(uerVar);
        uepVar.getClass();
        wv wvVarA = uepVar.a(viewGroup);
        ufe ufeVar = (ufe) wvVarA;
        uer uerVarA = ufeVar.a();
        uer uerVarA2 = ufeVar.a();
        if (uerVarA != uerVar) {
            throw new ejyc(ejxq.a("Expected to create a badge of type %s, but was %s.", uerVar, uerVarA2));
        }
        View view = wvVarA.a;
        final ViewParent parent = view.getParent();
        if (parent != null) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: uey
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    ViewParent viewParent = parent;
                    if (motionEvent.getAction() == 0) {
                        viewParent.getParent().requestDisallowInterceptTouchEvent(true);
                    } else if (motionEvent.getAction() == 1) {
                        viewParent.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    return false;
                }
            });
        }
        final uej uejVar = (uej) this.f.get(uerVar);
        if (uejVar != null) {
            view.setOnClickListener(new eifs(this.e, "com/google/android/apps/messaging/conversation/badges/BadgesRecyclerViewPeer$Adapter", "onCreateViewHolder", 228, "BadgesRecyclerView#onBadgeClick", new View.OnClickListener() { // from class: uex
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    uejVar.a(view2, uerVar);
                }
            }));
        }
        return wvVarA;
    }

    @Override // defpackage.vo
    public final void g(wv wvVar, int i) {
        ekgb ekgbVar = this.a;
        ekgbVar.getClass();
        ejwl.a(i < ekgbVar.size());
        ((uek) this.a.get(i)).b(wvVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vo
    public final void k(wv wvVar) {
        ((ufe) wvVar).b();
    }
}
