package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwpv extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ SuggestionData a;
    final /* synthetic */ AtomicReference b;
    final /* synthetic */ View c;
    final /* synthetic */ cwpx d;

    public cwpv(cwpx cwpxVar, SuggestionData suggestionData, AtomicReference atomicReference, View view) {
        this.a = suggestionData;
        this.b = atomicReference;
        this.c = view;
        this.d = cwpxVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        cwpx cwpxVar = this.d;
        crbi crbiVar = (crbi) cwpxVar.f.b();
        elqn elqnVar = elqn.P2P_SUGGESTION_LONG_PRESS;
        eyzv eyzvVar = eyzv.CONVERSATION_VIEW;
        boolean z = cwpxVar.h.b;
        float fFloatValue = ((Float) this.b.get()).floatValue();
        SuggestionData suggestionData = this.a;
        View view = this.c;
        auvh.h(crbiVar.e(suggestionData, elqnVar, eyzvVar, z, fFloatValue, cwpx.g(view), cwpx.h(view)));
        super.onLongPress(motionEvent);
    }
}
