package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwpx extends cwqi {
    public static final cqce a = cqce.g("Bugle", "ChipListConversationSuggestionsController");
    public MessageIdType b;
    public final Set c;
    public final Object d;
    public final cogw e;
    public final fcsu f;
    public final ajhd g;
    public final daoe h;
    public final fcsu i;
    public final aykm j;
    private final eigp x;

    public cwpx(Context context, cqmb cqmbVar, acgu acguVar, crba crbaVar, fcsu fcsuVar, crqv crqvVar, ajhd ajhdVar, cogw cogwVar, fcsu fcsuVar2, aykm aykmVar, cwtz cwtzVar, daoe daoeVar, eygg eyggVar, eigp eigpVar, fcsu fcsuVar3, fcsu fcsuVar4) {
        super(context, cqmbVar, acguVar, crbaVar, crqvVar, ajhdVar, cogwVar, fcsuVar2, aykmVar, cwtzVar, eyggVar, eigpVar, fcsuVar3, fcsuVar4);
        this.b = bary.a;
        this.c = new HashSet();
        this.d = new Object();
        this.f = fcsuVar;
        this.e = cogwVar;
        this.i = fcsuVar2;
        this.g = ajhdVar;
        this.j = aykmVar;
        this.h = daoeVar;
        this.x = eigpVar;
    }

    public static Boolean g(View view) {
        View viewO = o(view);
        if (viewO == null) {
            return null;
        }
        boolean z = true;
        if (!viewO.canScrollHorizontally(-1) && !viewO.canScrollHorizontally(1)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static Boolean h(View view) {
        View viewO = o(view);
        if (viewO != null) {
            return Boolean.valueOf(viewO.canScrollHorizontally(-1));
        }
        return null;
    }

    private static View o(View view) {
        if (view.getId() == R.id.suggestion_list_scroll_view) {
            return view;
        }
        View view2 = (View) view.getParent();
        if (view2 == null) {
            return null;
        }
        return o(view2);
    }

    @Override // defpackage.cwqi
    public final int a() {
        return R.dimen.conversation_suggestion_bubble_container_horizontal_padding;
    }

    @Override // defpackage.cwqi
    protected final int b() {
        return R.id.suggestion_button_icon;
    }

    @Override // defpackage.cwqi
    protected final int c() {
        return R.id.suggestion_button_label;
    }

    @Override // defpackage.cwqi
    protected final void d(cwty cwtyVar, cwtb cwtbVar) {
        super.d(cwtyVar, cwtbVar);
        cwtyVar.e().a();
    }

    @Override // defpackage.cwqi
    protected final int e() {
        return eehg.d(this.m, R.attr.colorPrimaryBrandIcon, "ChipListConversationSuggestionsController");
    }

    @Override // defpackage.cwqi
    protected final int f() {
        return eehg.d(this.m, R.attr.colorOnSurfaceVariant, "ChipListConversationSuggestionsController");
    }

    @Override // defpackage.cwqi
    protected final void i(SuggestionData suggestionData, cwtb cwtbVar, View view) {
        SuggestionData suggestionData2;
        if (cwtbVar.c()) {
            if (!((Boolean) ((cczi) crbf.ag.get()).e()).booleanValue()) {
                super.l(suggestionData, cwtbVar);
                return;
            }
            boolean z = suggestionData instanceof RbmSuggestionData;
            if (!z) {
                m();
            }
            if (!suggestionData.f()) {
                this.j.a(cwtbVar.a(), this.e.f().toEpochMilli()).s();
                ajhd ajhdVar = this.g;
                ajhdVar.V(z);
                if (z) {
                    ajhdVar.W();
                    ajhdVar.X();
                }
            } else if (z) {
                String strG = ((RbmSuggestionData) suggestionData).g();
                synchronized (this.d) {
                    Set set = this.c;
                    if (set.contains(strG)) {
                        return;
                    } else {
                        set.add(strG);
                    }
                }
            } else if (!this.b.c() && this.b.equals(suggestionData.w())) {
                return;
            } else {
                this.b = suggestionData.w();
            }
            if (z) {
                suggestionData2 = suggestionData;
            } else {
                ((crif) this.i.b()).n(suggestionData, ezai.CLICKED);
                suggestionData2 = suggestionData;
                auvh.h(((crbi) this.f.b()).e(suggestionData2, elqn.P2P_SUGGESTION_CLICK, eyzv.CONVERSATION_VIEW, this.h.b, 0.0f, g(view), h(view)));
            }
            cwtbVar.b(suggestionData2);
        }
    }

    @Override // defpackage.cwqi
    protected final void j(View view, final SuggestionData suggestionData, final cwtb cwtbVar) {
        final AtomicReference atomicReference = new AtomicReference(Float.valueOf(-1.0f));
        final boolean z = suggestionData instanceof RbmSuggestionData;
        if (!z) {
            AtomicReference atomicReference2 = new AtomicReference();
            atomicReference2.set(new GestureDetector(this.m, new cwpv(this, suggestionData, atomicReference, view)));
            view.setOnTouchListener(new cwpw(this, atomicReference2, atomicReference));
        }
        view.setOnClickListener(new eifs(this.x, "com/google/android/apps/messaging/ui/conversation/suggestions/ChipListConversationSuggestionsController", "setOnClickListener", 328, "ChipListConversationSuggestionsController#setOnClickListener.onClick", new View.OnClickListener() { // from class: cwpu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                boolean z2 = z;
                cwpx cwpxVar = this.a;
                if (!z2) {
                    cwpxVar.m();
                }
                cwtb cwtbVar2 = cwtbVar;
                SuggestionData suggestionData2 = suggestionData;
                if (!suggestionData2.f()) {
                    cwpxVar.j.a(cwtbVar2.a(), cwpxVar.e.f().toEpochMilli()).s();
                    ajhd ajhdVar = cwpxVar.g;
                    ajhdVar.V(z2);
                    if (z2) {
                        ajhdVar.W();
                        ajhdVar.X();
                    }
                } else if (z2) {
                    String strG = ((RbmSuggestionData) suggestionData2).g();
                    synchronized (cwpxVar.d) {
                        Set set = cwpxVar.c;
                        if (set.contains(strG)) {
                            return;
                        } else {
                            set.add(strG);
                        }
                    }
                } else if (!cwpxVar.b.c() && cwpxVar.b.equals(suggestionData2.w())) {
                    return;
                } else {
                    cwpxVar.b = suggestionData2.w();
                }
                if (!z2) {
                    AtomicReference atomicReference3 = atomicReference;
                    ((crif) cwpxVar.i.b()).n(suggestionData2, ezai.CLICKED);
                    auvh.h(((crbi) cwpxVar.f.b()).e(suggestionData2, elqn.P2P_SUGGESTION_CLICK, eyzv.CONVERSATION_VIEW, cwpxVar.h.b, ((Float) atomicReference3.get()).floatValue(), cwpx.g(view2), cwpx.h(view2)));
                }
                cwtbVar2.b(suggestionData2);
            }
        }));
    }
}
