/**
 */
package org.scopio.demo.psd.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.scopio.demo.psd.util.DemoPSDAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DemoPSDItemProviderAdapterFactory extends DemoPSDAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemoPSDItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.scopio.demo.psd.DemoPSDDiagram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DemoPSDDiagramItemProvider demoPSDDiagramItemProvider;

	/**
	 * This creates an adapter for a {@link org.scopio.demo.psd.DemoPSDDiagram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDemoPSDDiagramAdapter() {
		if (demoPSDDiagramItemProvider == null) {
			demoPSDDiagramItemProvider = new DemoPSDDiagramItemProvider(this);
		}

		return demoPSDDiagramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.scopio.demo.psd.ActorBoundary} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorBoundaryItemProvider actorBoundaryItemProvider;

	/**
	 * This creates an adapter for a {@link org.scopio.demo.psd.ActorBoundary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActorBoundaryAdapter() {
		if (actorBoundaryItemProvider == null) {
			actorBoundaryItemProvider = new ActorBoundaryItemProvider(this);
		}

		return actorBoundaryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.scopio.demo.psd.TR} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TRItemProvider trItemProvider;

	/**
	 * This creates an adapter for a {@link org.scopio.demo.psd.TR}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTRAdapter() {
		if (trItemProvider == null) {
			trItemProvider = new TRItemProvider(this);
		}

		return trItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.scopio.demo.psd.Elements} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementsItemProvider elementsItemProvider;

	/**
	 * This creates an adapter for a {@link org.scopio.demo.psd.Elements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElementsAdapter() {
		if (elementsItemProvider == null) {
			elementsItemProvider = new ElementsItemProvider(this);
		}

		return elementsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.scopio.demo.psd.Start} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartItemProvider startItemProvider;

	/**
	 * This creates an adapter for a {@link org.scopio.demo.psd.Start}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStartAdapter() {
		if (startItemProvider == null) {
			startItemProvider = new StartItemProvider(this);
		}

		return startItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.scopio.demo.psd.Links} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinksItemProvider linksItemProvider;

	/**
	 * This creates an adapter for a {@link org.scopio.demo.psd.Links}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinksAdapter() {
		if (linksItemProvider == null) {
			linksItemProvider = new LinksItemProvider(this);
		}

		return linksItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.scopio.demo.psd.ResponceLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponceLinkItemProvider responceLinkItemProvider;

	/**
	 * This creates an adapter for a {@link org.scopio.demo.psd.ResponceLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResponceLinkAdapter() {
		if (responceLinkItemProvider == null) {
			responceLinkItemProvider = new ResponceLinkItemProvider(this);
		}

		return responceLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.scopio.demo.psd.WaitingLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaitingLinkItemProvider waitingLinkItemProvider;

	/**
	 * This creates an adapter for a {@link org.scopio.demo.psd.WaitingLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWaitingLinkAdapter() {
		if (waitingLinkItemProvider == null) {
			waitingLinkItemProvider = new WaitingLinkItemProvider(this);
		}

		return waitingLinkItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (demoPSDDiagramItemProvider != null) demoPSDDiagramItemProvider.dispose();
		if (actorBoundaryItemProvider != null) actorBoundaryItemProvider.dispose();
		if (trItemProvider != null) trItemProvider.dispose();
		if (elementsItemProvider != null) elementsItemProvider.dispose();
		if (startItemProvider != null) startItemProvider.dispose();
		if (linksItemProvider != null) linksItemProvider.dispose();
		if (responceLinkItemProvider != null) responceLinkItemProvider.dispose();
		if (waitingLinkItemProvider != null) waitingLinkItemProvider.dispose();
	}

}
