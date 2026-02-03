package defpackage;

import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cnf {
    public String a;
    public CarText b;
    public kxa c;
    public CarIcon d;
    public boolean e;
    public List f;
    public cnb g;
    public final List h;
    public final boolean i;

    @Deprecated
    public cnf() {
        this.i = true;
        this.h = new ArrayList();
    }

    public cnf(ConversationItem conversationItem) {
        this.i = true;
        this.a = conversationItem.getId();
        this.b = conversationItem.getTitle();
        this.c = conversationItem.getSelf();
        this.d = conversationItem.getIcon();
        this.e = conversationItem.isGroupConversation();
        this.g = conversationItem.getConversationCallbackDelegate();
        this.f = conversationItem.getMessages();
        this.h = new ArrayList(conversationItem.getActions());
    }
}
