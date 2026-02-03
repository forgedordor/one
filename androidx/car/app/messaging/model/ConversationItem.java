package androidx.car.app.messaging.model;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import defpackage.cmb;
import defpackage.cnb;
import defpackage.cne;
import defpackage.cnf;
import defpackage.cng;
import defpackage.cny;
import defpackage.crk;
import defpackage.kwz;
import defpackage.kxa;
import defpackage.lcg;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@cmb
/* loaded from: classes.dex */
public class ConversationItem implements cny {
    private final List<Action> mActions;
    private final cnb mConversationCallbackDelegate;
    private final CarIcon mIcon;
    private final String mId;
    private final boolean mIndexable;
    private final boolean mIsGroupConversation;
    private final List<CarMessage> mMessages;
    private final kxa mSelf;
    private final CarText mTitle;

    private ConversationItem() {
        this.mId = "";
        this.mTitle = new CarText.Builder("").build();
        kwz kwzVar = new kwz();
        kwzVar.a = "";
        this.mSelf = new kxa(kwzVar);
        this.mIcon = null;
        this.mIsGroupConversation = false;
        this.mMessages = new ArrayList();
        this.mConversationCallbackDelegate = new ConversationCallbackDelegateImpl(new cne());
        this.mActions = Collections.EMPTY_LIST;
        this.mIndexable = true;
    }

    static kxa validateSender(kxa kxaVar) {
        kxaVar.getClass();
        kxaVar.a.getClass();
        kxaVar.d.getClass();
        return kxaVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationItem)) {
            return false;
        }
        ConversationItem conversationItem = (ConversationItem) obj;
        return Objects.equals(this.mId, conversationItem.mId) && Objects.equals(this.mTitle, conversationItem.mTitle) && Objects.equals(this.mIcon, conversationItem.mIcon) && cng.b(getSelf(), conversationItem.getSelf()) && this.mIsGroupConversation == conversationItem.mIsGroupConversation && Objects.equals(this.mMessages, conversationItem.mMessages) && Objects.equals(this.mActions, conversationItem.mActions) && this.mIndexable == conversationItem.mIndexable;
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public cnb getConversationCallbackDelegate() {
        return this.mConversationCallbackDelegate;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public String getId() {
        return this.mId;
    }

    public List<CarMessage> getMessages() {
        return this.mMessages;
    }

    public kxa getSelf() {
        return this.mSelf;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(cng.a(getSelf())), this.mId, this.mTitle, this.mIcon, Boolean.valueOf(this.mIsGroupConversation), this.mMessages, this.mActions, Boolean.valueOf(this.mIndexable));
    }

    public boolean isGroupConversation() {
        return this.mIsGroupConversation;
    }

    public boolean isIndexable() {
        return this.mIndexable;
    }

    public ConversationItem(cnf cnfVar) {
        String str = cnfVar.a;
        str.getClass();
        this.mId = str;
        CarText carText = cnfVar.b;
        carText.getClass();
        this.mTitle = carText;
        kxa kxaVar = cnfVar.c;
        validateSender(kxaVar);
        this.mSelf = kxaVar;
        this.mIcon = cnfVar.d;
        this.mIsGroupConversation = cnfVar.e;
        List<CarMessage> listB = crk.b(cnfVar.f);
        listB.getClass();
        this.mMessages = listB;
        lcg.d(!listB.isEmpty(), "Message list cannot be empty.");
        Iterator<CarMessage> it = listB.iterator();
        while (it.hasNext()) {
            lcg.d(it.next() != null, "Message list cannot contain null messages");
        }
        cnb cnbVar = cnfVar.g;
        cnbVar.getClass();
        this.mConversationCallbackDelegate = cnbVar;
        this.mActions = crk.b(cnfVar.h);
        boolean z = cnfVar.i;
        this.mIndexable = true;
    }
}
