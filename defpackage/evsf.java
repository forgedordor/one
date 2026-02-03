package defpackage;

import defpackage.evsf;
import defpackage.evsn;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class evsf<MessageType extends evsn<MessageType, BuilderType>, BuilderType extends evsf<MessageType, BuilderType>> extends evpy<MessageType, BuilderType> {
    private final MessageType defaultInstance;
    public MessageType instance;

    protected evsf(MessageType messagetype) {
        this.defaultInstance = messagetype;
        if (messagetype.isMutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.instance = (MessageType) newMutableInstance();
    }

    private static <MessageType> void mergeFromInstance(MessageType messagetype, MessageType messagetype2) {
        evuq.a.b(messagetype).h(messagetype, messagetype2);
    }

    private MessageType newMutableInstance() {
        return (MessageType) this.defaultInstance.newMutableInstance();
    }

    @Override // defpackage.evug
    public final MessageType build() {
        MessageType messagetype = (MessageType) buildPartial();
        if (messagetype.isInitialized()) {
            return messagetype;
        }
        throw newUninitializedMessageException(messagetype);
    }

    @Override // defpackage.evug
    public MessageType buildPartial() {
        if (!this.instance.isMutable()) {
            return this.instance;
        }
        this.instance.makeImmutable();
        return this.instance;
    }

    public final BuilderType clear() {
        if (this.defaultInstance.isMutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.instance = (MessageType) newMutableInstance();
        return this;
    }

    public final void copyOnWrite() {
        if (this.instance.isMutable()) {
            return;
        }
        copyOnWriteInternal();
    }

    protected void copyOnWriteInternal() {
        MessageType messagetype = (MessageType) newMutableInstance();
        mergeFromInstance(messagetype, this.instance);
        this.instance = messagetype;
    }

    @Override // defpackage.evui
    public MessageType getDefaultInstanceForType() {
        return this.defaultInstance;
    }

    @Override // defpackage.evui
    public final boolean isInitialized() {
        return evsn.isInitialized(this.instance, false);
    }

    @Override // defpackage.evpy
    /* renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BuilderType mo442clone() {
        BuilderType buildertype = (BuilderType) getDefaultInstanceForType().newBuilderForType();
        buildertype.instance = (MessageType) buildPartial();
        return buildertype;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.evpy
    public BuilderType internalMergeFrom(MessageType messagetype) {
        return (BuilderType) mergeFrom((evsf<MessageType, BuilderType>) messagetype);
    }

    @Override // defpackage.evpy, defpackage.evug
    public BuilderType mergeFrom(evqz evqzVar, evrr evrrVar) throws IOException {
        copyOnWrite();
        try {
            evuq.a.b(this.instance).i(this.instance, evra.p(evqzVar), evrrVar);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    /* renamed from: clear, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ evug m448clear() {
        clear();
        return this;
    }

    public BuilderType mergeFrom(MessageType messagetype) {
        if (getDefaultInstanceForType().equals(messagetype)) {
            return this;
        }
        copyOnWrite();
        mergeFromInstance(this.instance, messagetype);
        return this;
    }

    @Override // defpackage.evpy
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public BuilderType mo446mergeFrom(byte[] bArr, int i, int i2) {
        evrr evrrVar = evrr.a;
        evuq evuqVar = evuq.a;
        return (BuilderType) mo447mergeFrom(bArr, i, i2, evrr.a);
    }

    @Override // defpackage.evpy
    /* renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public BuilderType mo447mergeFrom(byte[] bArr, int i, int i2, evrr evrrVar) throws evtj {
        copyOnWrite();
        try {
            evuq.a.b(this.instance).j(this.instance, bArr, i, i + i2, new evqf(evrrVar));
            return this;
        } catch (evtj e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
