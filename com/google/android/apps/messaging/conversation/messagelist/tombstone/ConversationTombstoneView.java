package com.google.android.apps.messaging.conversation.messagelist.tombstone;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.afhk;
import defpackage.baea;
import defpackage.baeb;
import defpackage.bydd;
import defpackage.cuiu;
import defpackage.cvuk;
import defpackage.eygg;
import defpackage.fcsu;
import defpackage.umk;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationTombstoneView extends umk {
    public baea a;
    public TextView b;
    public TextView c;
    public baeb d;
    public eygg e;
    public fcsu f;
    public eygg g;
    public fcsu h;
    public cvuk i;

    public ConversationTombstoneView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a() {
        ((Optional) this.f.b()).ifPresent(new Consumer() { // from class: umd
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((cvun) obj).a(this.a.b, R.dimen.tombstone_text_size);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((Optional) this.f.b()).ifPresent(new Consumer() { // from class: ume
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((cvun) obj).a(this.a.c, R.dimen.message_metadata_text_size);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = new cvuk() { // from class: umf
        };
        ((Optional) this.e.b()).ifPresent(new Consumer() { // from class: umg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((cvul) obj).h(this.a.i);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        if (this.a.e() == 210) {
            ((afhk) this.h.b()).h();
        }
        a();
        ((Optional) this.e.b()).ifPresent(new Consumer() { // from class: umh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((cvul) obj).i(this.a.i);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = this.d.a();
        this.b = (TextView) findViewById(R.id.tombstone_message);
        this.c = (TextView) findViewById(R.id.tombstone_timestamp);
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        super.setSelected(z);
        int iC = z ? cuiu.c(getContext()) : cuiu.a(getContext());
        Optional optionalFindAny = Collection.EL.stream((Set) this.g.b()).filter(new Predicate() { // from class: umi
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((bydd) obj).a(this.a.a);
            }
        }).findAny();
        if (optionalFindAny.isPresent() && ((bydd) optionalFindAny.get()).b(z)) {
            iC = 0;
        }
        this.b.setBackgroundColor(iC);
    }
}
