package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwnn implements aday {
    public static final eksp a = eksp.c("Bugle");
    private final Context b;
    private final fcsu c;
    private final egpr d;
    private final egps e;
    private final egps f = new egps<SelectedConversation, evwl<agzr>>() { // from class: cwnn.1
        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            ((eksl) ((eksl) cwnn.a.h()).h("com/google/android/apps/messaging/ui/conversation/pintotop/PinToTopMenuExtension$1", "onSuccess", 62, "PinToTopMenuExtension.java")).q("Conversation unpinned.");
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            ((eksl) ((eksl) ((eksl) cwnn.a.i()).g(th)).h("com/google/android/apps/messaging/ui/conversation/pintotop/PinToTopMenuExtension$1", "onFailure", 'C', "PinToTopMenuExtension.java")).q("Failed to pin conversation");
        }

        @Override // defpackage.egps
        public final /* synthetic */ void b(Object obj) {
        }
    };
    private MenuItem g;

    public cwnn(final Context context, fcsu fcsuVar, egpr egprVar) {
        this.b = context;
        this.c = fcsuVar;
        this.d = egprVar;
        this.e = new egps<SelectedConversation, evwl<agzr>>() { // from class: cwnn.2
            @Override // defpackage.egps
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                agzr agzrVar = (agzr) ((evwl) obj2).a(agzr.a, evrr.a());
                int i = agzrVar.b;
                int iB = agzq.b(i);
                if (iB != 0 && iB == 3) {
                    Context context2 = context;
                    Resources resources = context2.getResources();
                    cczv cczvVar = agzg.a;
                    Toast.makeText(context2, resources.getQuantityString(R.plurals.pin_success_message_plural, ((Integer) cczvVar.e()).intValue(), Integer.valueOf((int) agzrVar.c), cczvVar.e()), 1).show();
                    return;
                }
                int iB2 = agzq.b(i);
                if (iB2 != 0 && iB2 == 5) {
                    Context context3 = context;
                    Resources resources2 = context3.getResources();
                    cczv cczvVar2 = agzg.a;
                    Toast.makeText(context3, resources2.getQuantityString(R.plurals.pin_limit_messages_plural, ((Integer) cczvVar2.e()).intValue(), cczvVar2.e()), 1).show();
                }
            }

            @Override // defpackage.egps
            public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
                ((eksl) ((eksl) ((eksl) cwnn.a.i()).g(th)).h("com/google/android/apps/messaging/ui/conversation/pintotop/PinToTopMenuExtension$2", "onFailure", 'k', "PinToTopMenuExtension.java")).q("Failed to pin conversation");
            }

            @Override // defpackage.egps
            public final /* synthetic */ void b(Object obj) {
            }
        };
    }

    @Override // defpackage.aday
    public final int a() {
        return R.id.action_pin_to_top;
    }

    @Override // defpackage.aday
    public final void b(Menu menu) {
        MenuItem menuItemAdd = menu.add(0, R.id.action_pin_to_top, 40, this.b.getString(R.string.action_pin_to_top));
        this.g = menuItemAdd;
        menuItemAdd.setShowAsAction(2);
        this.g.setIcon(R.drawable.tinted_quantum_gm_ic_keep_pin_outline_24);
    }

    @Override // defpackage.aday
    public final void c(Collection collection) {
        if (((Boolean) agzg.b.e()).booleanValue() && collection.isEmpty()) {
            ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/ui/conversation/pintotop/PinToTopMenuExtension", "onClick", 139, "PinToTopMenuExtension.java")).q("No selected conversation to pin");
            return;
        }
        SelectedConversation selectedConversation = (SelectedConversation) collection.iterator().next();
        if (selectedConversation.q) {
            egpr egprVar = this.d;
            final agzm agzmVar = (agzm) this.c.b();
            final ConversationIdType conversationIdType = selectedConversation.a;
            int i = selectedConversation.o;
            egprVar.h(egpq.a(eijx.g(new Callable() { // from class: agzk
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final agzm agzmVar2 = agzmVar;
                    final ConversationIdType conversationIdType2 = conversationIdType;
                    return (agzr) agzmVar2.c.c("unPinConversationToTop", new ejxr() { // from class: agzi
                        @Override // defpackage.ejxr
                        public final Object get() {
                            agzp agzpVar = (agzp) agzr.a.createBuilder();
                            String[] strArr = bodn.a;
                            bodf bodfVar = new bodf();
                            bodfVar.f("unpinConversationFromTop");
                            final ConversationIdType conversationIdType3 = conversationIdType2;
                            bodfVar.a(new Function() { // from class: agzh
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    bodm bodmVar = (bodm) obj;
                                    eksp ekspVar = agzm.a;
                                    bodmVar.b(conversationIdType3);
                                    return bodmVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            int iD = bodfVar.d();
                            bodk bodkVar = new bodk(bodn.a);
                            bodkVar.A("unpinConversationFromTop");
                            int iH = bodkVar.b().h();
                            agzm agzmVar3 = agzmVar2;
                            ((bxlc) agzmVar3.f.b()).e(conversationIdType3, true);
                            agzo agzoVar = (agzo) agzmVar3.e.b();
                            boolean z = iD > 0;
                            agzoVar.b(3, iH, z ? 2 : 3);
                            int i2 = true != z ? 4 : 3;
                            agzpVar.copyOnWrite();
                            ((agzr) agzpVar.instance).b = agzq.a(i2);
                            return agzpVar.build();
                        }
                    });
                }
            }, agzmVar.b)), new egpo(selectedConversation), this.f);
            return;
        }
        egpr egprVar2 = this.d;
        final agzm agzmVar2 = (agzm) this.c.b();
        final ConversationIdType conversationIdType2 = selectedConversation.a;
        int i2 = selectedConversation.o;
        egprVar2.h(egpq.a(eijx.g(new Callable() { // from class: agzl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final agzm agzmVar3 = agzmVar2;
                final ConversationIdType conversationIdType3 = conversationIdType2;
                return (agzr) agzmVar3.c.c("pinConversationToTop", new ejxr() { // from class: agzj
                    @Override // defpackage.ejxr
                    public final Object get() {
                        agzp agzpVar = (agzp) agzr.a.createBuilder();
                        String[] strArr = bodn.a;
                        bodk bodkVar = new bodk(bodn.a);
                        bodkVar.A("pinConversationToTop");
                        int iH = bodkVar.b().h();
                        cczv cczvVar = agzg.a;
                        int iIntValue = ((Integer) cczvVar.e()).intValue();
                        agzm agzmVar4 = agzmVar3;
                        if (iH >= iIntValue) {
                            ((eksl) agzm.a.n().h("com/google/android/apps/messaging/pintotop/PinToTopManager", "pinConversationToTop", 62, "PinToTopManager.java")).t("Conversation pin threshold of %s reached", cczvVar.e());
                            ((agzo) agzmVar4.e.b()).b(2, iH, 4);
                            agzpVar.copyOnWrite();
                            ((agzr) agzpVar.instance).b = agzq.a(5);
                            return agzpVar.build();
                        }
                        ConversationIdType conversationIdType4 = conversationIdType3;
                        bocp bocpVar = new bocp();
                        bocpVar.b(conversationIdType4);
                        bocpVar.c(true);
                        final bocm bocmVarA = bocpVar.a();
                        final dqsy dqsyVarA = bodn.a();
                        long jB = dqru.b(bodn.a(), "conversation_pin", bocmVarA, new Function() { // from class: bocj
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return Long.valueOf(dqsyVarA.P("conversation_pin", (dqst) obj));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Consumer() { // from class: bock
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                bocmVarA.m((Long) obj);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        Long.valueOf(jB).getClass();
                        if (jB <= 0) {
                            ((eksl) agzm.a.n().h("com/google/android/apps/messaging/pintotop/PinToTopManager", "pinConversationToTop", 82, "PinToTopManager.java")).q("Conversation was not pinned.");
                            ((agzo) agzmVar4.e.b()).b(2, iH, 3);
                            agzpVar.copyOnWrite();
                            ((agzr) agzpVar.instance).b = agzq.a(4);
                            return agzpVar.build();
                        }
                        int i3 = iH + 1;
                        ((bxlc) agzmVar4.f.b()).e(conversationIdType4, true);
                        ((agzo) agzmVar4.e.b()).b(2, i3, 2);
                        ((acgu) agzmVar4.d.b()).a(25);
                        agzpVar.copyOnWrite();
                        ((agzr) agzpVar.instance).b = agzq.a(3);
                        agzpVar.copyOnWrite();
                        ((agzr) agzpVar.instance).c = i3;
                        return agzpVar.build();
                    }
                });
            }
        }, agzmVar2.b)), new egpo(selectedConversation), this.e);
    }

    @Override // defpackage.aday
    public final void d(Collection collection) {
        if (collection.size() != 1) {
            this.g.setVisible(false);
            return;
        }
        SelectedConversation selectedConversation = (SelectedConversation) collection.iterator().next();
        if (selectedConversation.f.d()) {
            this.g.setVisible(false);
            return;
        }
        String string = selectedConversation.q ? this.b.getString(R.string.action_unpin_from_top) : this.b.getString(R.string.action_pin_to_top);
        this.g.setIcon(true != selectedConversation.q ? R.drawable.tinted_quantum_gm_ic_keep_pin_outline_24 : R.drawable.quantum_gm_ic_unpin_vd_theme_24);
        this.g.setTitle(string);
        this.g.setVisible(true);
    }

    @Override // defpackage.aday
    public final void e(ea eaVar) {
        egpr egprVar = this.d;
        egprVar.j(this.e);
        egprVar.j(this.f);
    }

    @Override // defpackage.aday
    public final /* synthetic */ void f() {
    }
}
