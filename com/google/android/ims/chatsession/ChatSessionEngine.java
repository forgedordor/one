package com.google.android.ims.chatsession;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.ims.rcsservice.chatsession.ChatSessionServiceResult;
import com.google.android.ims.rcsservice.chatsession.IChatSession;
import com.google.android.ims.rcsservice.chatsession.MessageRevocationSupportedResult;
import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import com.google.android.ims.rcsservice.group.GroupInfo;
import defpackage.dewn;
import defpackage.dewo;
import defpackage.deyw;
import defpackage.dfnv;
import defpackage.dfny;
import defpackage.dfod;
import defpackage.dhbz;
import defpackage.dhff;
import defpackage.dhip;
import defpackage.dhja;
import defpackage.ewdu;
import defpackage.ewdw;
import defpackage.ewdz;
import defpackage.eweb;
import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ChatSessionEngine extends IChatSession.Stub {
    private final Context d;
    private dewo e;
    private final dhbz f;
    public deyw rcsExtensionSender;
    static final dfny<Boolean> ENABLE_RECOVER_DISABLED_RCS_GROUPS_FROM_TELEPHONY = dfod.a(149786222);
    static final dfny<Boolean> enableChatSessionEngineLogIncomingRpcEvent = dfnv.b("enable_chat_session_engine_log_incoming_rpc_event");
    static final dfny<Boolean> enableChatSessionEngineMethodsNotImplemented = dfnv.b("enable_chat_session_engine_methods_not_implemented");
    private static final dhip a = new dhip("IChatSession");
    private static final String[] b = new String[0];
    private static final long[] c = new long[0];

    public ChatSessionEngine(Context context, dhbz dhbzVar, deyw deywVar) {
        this.d = context;
        this.f = dhbzVar;
        this.rcsExtensionSender = deywVar;
    }

    private final void a(Optional optional, Optional optional2, int i) {
        ewdu ewduVar = (ewdu) ewdw.a.createBuilder();
        ewduVar.copyOnWrite();
        ewdw ewdwVar = (ewdw) ewduVar.instance;
        ewdwVar.d = i - 1;
        ewdwVar.b |= 32;
        if (optional2.isPresent()) {
            String string = optional2.get().toString();
            ewduVar.copyOnWrite();
            ewdw ewdwVar2 = (ewdw) ewduVar.instance;
            ewdwVar2.b |= 1;
            ewdwVar2.c = string;
        }
        optional.isPresent();
        ewdz ewdzVar = (ewdz) eweb.a.createBuilder();
        ewdzVar.copyOnWrite();
        eweb ewebVar = (eweb) ewdzVar.instance;
        ewebVar.e = 1;
        ewebVar.b |= 1;
        ewdzVar.copyOnWrite();
        eweb ewebVar2 = (eweb) ewdzVar.instance;
        ewdw ewdwVar3 = (ewdw) ewduVar.build();
        ewdwVar3.getClass();
        ewebVar2.d = ewdwVar3;
        ewebVar2.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
        this.rcsExtensionSender.e(this.d, (eweb) ewdzVar.build());
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult addUserToSession(long j, String str) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult endSession(long j) throws RemoteException {
        if (((Boolean) enableChatSessionEngineMethodsNotImplemented.a()).booleanValue()) {
            throw new dewn("endSession");
        }
        dhff.d(this.d, Binder.getCallingUid());
        dewo dewoVar = this.e;
        if (Objects.isNull(dewoVar)) {
            return new ChatSessionServiceResult(2);
        }
        try {
            return dewoVar.b(j);
        } catch (Exception e) {
            dhja.i(e, "Error while ending chat session: %s", e.getMessage());
            return new ChatSessionServiceResult(1);
        }
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public long[] getActiveSessionIds() throws RemoteException {
        if (((Boolean) enableChatSessionEngineMethodsNotImplemented.a()).booleanValue()) {
            throw new dewn("getActiveSessionIds");
        }
        dhja.d(a, "Starting get active sessions", new Object[0]);
        if (((Boolean) enableChatSessionEngineLogIncomingRpcEvent.a()).booleanValue()) {
            a(Optional.empty(), Optional.empty(), 7);
        }
        dhff.d(this.d, Binder.getCallingUid());
        return getActiveSessions();
    }

    @Deprecated
    public long[] getActiveSessions() {
        if (((Boolean) enableChatSessionEngineMethodsNotImplemented.a()).booleanValue()) {
            throw new dewn("getActiveSessions");
        }
        dewo dewoVar = this.e;
        if (Objects.isNull(dewoVar)) {
            dhja.h(a, "Error on getting sessions no chat session provider.", new Object[0]);
            return c;
        }
        dhja.d(a, "Try get active sessions", new Object[0]);
        return dewoVar.j();
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public GroupInfo getGroupInfo(long j) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public long getPreferredSessionByUser(String str) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public String getRemoteUserId(long j) throws RemoteException {
        if (((Boolean) enableChatSessionEngineMethodsNotImplemented.a()).booleanValue()) {
            throw new dewn("getRemoteUserId");
        }
        dhip dhipVar = a;
        Long lValueOf = Long.valueOf(j);
        dhja.d(dhipVar, "Starting getRemoteUserId for sessionId %s", lValueOf);
        if (((Boolean) enableChatSessionEngineLogIncomingRpcEvent.a()).booleanValue()) {
            a(Optional.empty(), Optional.of(lValueOf), 19);
        }
        dhff.d(this.d, Binder.getCallingUid());
        dewo dewoVar = this.e;
        if (Objects.isNull(dewoVar)) {
            dhja.h(dhipVar, "Could not get remote user id for sessionId %s no chat session provider.", lValueOf);
            return null;
        }
        try {
            dhja.d(dhipVar, "Try getRemoteUserId for session %s", lValueOf);
            return dewoVar.h(j);
        } catch (Exception e) {
            dhja.i(e, "Error while getting remote user id: %s", e.getMessage());
            return null;
        }
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public final ChatSessionServiceResult getSessionState(long j) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public long[] getSessionsByUser(String str) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult getUpdatedGroupInfo(String str, String str2) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public String[] getUsersInSession(long j) throws RemoteException {
        if (((Boolean) enableChatSessionEngineMethodsNotImplemented.a()).booleanValue()) {
            throw new dewn("getUsersInSession");
        }
        dhip dhipVar = a;
        Long lValueOf = Long.valueOf(j);
        dhja.d(dhipVar, "Starting get users in session for session %s", lValueOf);
        if (((Boolean) enableChatSessionEngineLogIncomingRpcEvent.a()).booleanValue()) {
            a(Optional.empty(), Optional.of(lValueOf), 18);
        }
        dhff.d(this.d, Binder.getCallingUid());
        dewo dewoVar = this.e;
        if (Objects.isNull(dewoVar)) {
            dhja.h(dhipVar, "Could not get users in session for session id %s no chat session provider.", lValueOf);
            return b;
        }
        try {
            dhja.d(dhipVar, "Try get users in session for session %s", lValueOf);
            return dewoVar.k(j);
        } catch (Exception e) {
            dhja.i(e, "Error while users in chat session: %s", e.getMessage());
            return b;
        }
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public boolean isGroupSession(long j) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public MessageRevocationSupportedResult isMessageRevocationSupported(long j) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult joinSession(long j) throws RemoteException {
        if (((Boolean) enableChatSessionEngineMethodsNotImplemented.a()).booleanValue()) {
            throw new dewn("joinSession");
        }
        dhff.d(this.d, Binder.getCallingUid());
        dewo dewoVar = this.e;
        if (Objects.isNull(dewoVar)) {
            return new ChatSessionServiceResult(2);
        }
        try {
            return dewoVar.c(j);
        } catch (Exception e) {
            dhja.i(e, "Error while joining chat session: %s", e.getMessage());
            return new ChatSessionServiceResult(1);
        }
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult leaveSession(long j) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Deprecated
    public void registerProvider(dewo dewoVar) {
        if (((Boolean) enableChatSessionEngineMethodsNotImplemented.a()).booleanValue()) {
            throw new dewn("registerProvider");
        }
        this.e = dewoVar;
    }

    @Deprecated
    public long registerSession(dewo dewoVar) {
        if (((Boolean) enableChatSessionEngineMethodsNotImplemented.a()).booleanValue()) {
            throw new dewn("registerSession");
        }
        return this.f.a();
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public final ChatSessionServiceResult removeUserFromSession(long j, String str) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public final ChatSessionServiceResult reportRbmSpam(String str, String str2) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult revokeMessage(String str, String str2) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult sendGroupReport(long j, String str, String str2, long j2, int i) {
        throw new IllegalStateException("Method not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult sendIndicator(long j, int i) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public final ChatSessionServiceResult sendMessage(long j, ChatMessage chatMessage) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult sendMessageTo(String str, ChatMessage chatMessage) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult sendPrivateIndicator(long j, String str, int i) throws RemoteException {
        if (((Boolean) enableChatSessionEngineMethodsNotImplemented.a()).booleanValue()) {
            throw new dewn("sendPrivateIndicator");
        }
        dhff.d(this.d, Binder.getCallingUid());
        dewo dewoVar = this.e;
        if (Objects.isNull(dewoVar)) {
            dhja.h(a, "Unable to send private indicator, chat session provider not initialized.", new Object[0]);
            return new ChatSessionServiceResult(2);
        }
        try {
            dhja.d(a, "Sending private indicator [%d]", Integer.valueOf(i));
            return dewoVar.l(j);
        } catch (Exception e) {
            dhja.i(e, "Error while sending private indicator: %s", e.getMessage());
            return new ChatSessionServiceResult(1);
        }
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public final ChatSessionServiceResult sendPrivateMessage(long j, String str, ChatMessage chatMessage) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public ChatSessionServiceResult sendReport(String str, String str2, String str3, long j, int i) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult sendSuggestionPostBack(String str, String str2, String str3, String str4, String str5) {
        throw new UnsupportedOperationException("sendSuggestionPostBack is deprecated");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult startGroupSession(String[] strArr) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult startGroupSessionWithMessage(String[] strArr, ChatMessage chatMessage) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult startGroupSessionWithMessageAndSubject(String[] strArr, ChatMessage chatMessage, String str) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public final ChatSessionServiceResult startSessionWithMessage(String str, ChatMessage chatMessage) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Deprecated
    public void unregisterProvider(dewo dewoVar) {
        if (((Boolean) enableChatSessionEngineMethodsNotImplemented.a()).booleanValue()) {
            throw new dewn("unregisterProvider");
        }
        this.e = null;
    }

    @Deprecated
    public void unregisterSession(long j) {
    }
}
